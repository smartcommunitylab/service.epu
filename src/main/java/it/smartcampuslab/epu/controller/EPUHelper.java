package it.smartcampuslab.epu.controller;

import it.infotn.epu.DomandaEPU;
import it.infotn.epu.DomandaEPUService;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.crypto.Cipher;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class EPUHelper {

	@Autowired
	@Value("${epu_endpoint}")
	private String epuEndpoint;	
	
	@Autowired
	@Value("${u_n}")
	private String epusername;

	@Autowired
	@Value("${p_v}")
	private String epuPassword;	

	@Autowired
	@Value("${cert_p}")
	private String certPassword;
	
	@Autowired
	@Value("${cert_n}")
	private String certName;	
	
	private SocketFactory socketFactory;

	public EPUHelper() {
	}
	
	@PostConstruct
	public void init() throws Exception {
		initSSL();
	}	
	
	
	public DomandaEPU getPort() throws EPUException {
		try {
			DomandaEPUService des = new DomandaEPUService();
			DomandaEPU port = des.getDomandaEPUPort();

			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, epuEndpoint);
			req_ctx.put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", socketFactory);

			Map<String, List<String>> headers = new HashMap<String, List<String>>();
			headers.put("username", Collections.singletonList(epusername));
			headers.put("password", Collections.singletonList(epuPassword));
			req_ctx.put(MessageContext.HTTP_REQUEST_HEADERS, headers);

			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}	
	
	public String ping() throws Exception {
		URL url = new URL(epuEndpoint + "?wsdl");
		HttpsURLConnection con = (HttpsURLConnection) url.openConnection();

		StringBuilder sb = new StringBuilder();
		
		InputStream is;
		
		try {
			is = con.getInputStream();
		} catch (Exception e) {
			is = con.getErrorStream();
		}

		Reader reader = new InputStreamReader(is);
		while (true) {
			int ch = reader.read();
			if (ch == -1) {
				break;
			}
			sb.append((char) ch);
		}

		return sb.toString();
	}
	
	private void initSSL() throws Exception {
		TrustManager[] trust = new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public boolean isServerTrusted(X509Certificate[] certs) {
				return true;
			}

			public boolean isClientTrusted(X509Certificate[] certs) {
				return true;
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
				return;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
				return;
			}
		} };

		InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream(certName);
		KeyStore keyStore = KeyStore.getInstance("PKCS12");
		keyStore.load(is, certPassword.toCharArray());
		Key key = keyStore.getKey("1", certPassword.toCharArray());
		Cipher c = Cipher.getInstance(key.getAlgorithm());
		c.init(Cipher.ENCRYPT_MODE, key);

		SSLContext sslContext = SSLContext.getInstance("TLS");
		KeyManagerFactory kmfactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
		kmfactory.init(keyStore, certPassword.toCharArray());
		KeyManager[] keymanagers = kmfactory.getKeyManagers();
		sslContext.init(keymanagers, trust, null);
		HttpsURLConnection.setDefaultSSLSocketFactory(sslContext.getSocketFactory());
		HostnameVerifier allHostsValid = new HostnameVerifier() {
			public boolean verify(String hostname, SSLSession session) {
				return true;
			}
		};
		HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

		socketFactory = sslContext.getSocketFactory();

	}	
	
}
