package it.smartcampuslab.epu.controller;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Map;
import java.util.TreeMap;

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
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import com.adobe.idp.services.approvalpdf.ModulisticaOnlineApprovalPDF;
import com.adobe.idp.services.approvalpdf.ModulisticaOnlineApprovalPDFService;
import com.adobe.idp.services.formupload.ModulisticaOnlineFormUpload;
import com.adobe.idp.services.formupload.ModulisticaOnlineFormUploadService;
import com.adobe.idp.services.getpdf.ModulisticaOnlineGetPDF;
import com.adobe.idp.services.getpdf.ModulisticaOnlineGetPDFService;
import com.sun.xml.ws.client.BindingProviderProperties;

public class AdobeHelper {

	@Autowired
	@Value("${adobe_endpoint}")
	private String adobeEndpoint;

	@Autowired
	@Value("${p3_u}")
	private String p3Username;

	@Autowired
	@Value("${p3_p}")
	private String p3Password;

	@Autowired
	@Value("${cert_p}")
	private String certPassword;

	@Autowired
	@Value("${cert_n}")
	private String certName;

	private SocketFactory socketFactory;

	public AdobeHelper() {
	}

	@PostConstruct
	public void init() throws Exception {
		initSSL();
	}
	
	public String ping() throws Exception {
		URL url = new URL(adobeEndpoint + "soap/services/ModulisticaOnline/GetPDF?wsdl&lc_version=11.0.0");
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

	public ModulisticaOnlineFormUpload getUpload() throws EPUException {
		try {
			ModulisticaOnlineFormUploadService service = new ModulisticaOnlineFormUploadService();
			ModulisticaOnlineFormUpload port = service.getFormUpload();
			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

			req_ctx.put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", socketFactory);
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, adobeEndpoint + "soap/services/ModulisticaOnline/FormUpload");
			req_ctx.put(BindingProvider.USERNAME_PROPERTY, p3Username);
			req_ctx.put(BindingProvider.PASSWORD_PROPERTY, p3Password);
			req_ctx.put("com.sun.xml.internal.ws.request.timeout", 1000 * 60 * 5);
			req_ctx.put("com.sun.xml.internal.ws.connect.timeout", 1000 * 60 * 5);
			req_ctx.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000 * 60 * 5);
			req_ctx.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000 * 60 * 5);
			
			
			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}

	public ModulisticaOnlineGetPDF getPDF() throws EPUException {
		try {
			ModulisticaOnlineGetPDFService service = new ModulisticaOnlineGetPDFService();
			ModulisticaOnlineGetPDF port = service.getGetPDF();
			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

			req_ctx.put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", socketFactory);
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, adobeEndpoint + "soap/services/ModulisticaOnline/GetPDF");
			req_ctx.put(BindingProvider.USERNAME_PROPERTY, p3Username);
			req_ctx.put(BindingProvider.PASSWORD_PROPERTY, p3Password);
			req_ctx.put("com.sun.xml.internal.ws.request.timeout", 1000 * 60 * 5);
			req_ctx.put("com.sun.xml.internal.ws.connect.timeout", 1000 * 60 * 5);	
			req_ctx.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000 * 60 * 5);
			req_ctx.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000 * 60 * 5);			

			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}

	public ModulisticaOnlineGetPDF getPDFBinary() throws EPUException {
		try {
			ModulisticaOnlineGetPDFService service = new ModulisticaOnlineGetPDFService();
			ModulisticaOnlineGetPDF port = service.getGetPDF();
			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

			req_ctx.put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", socketFactory);
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, adobeEndpoint + "soap/services/ModulisticaOnline/GetPDF?blob=base64");
			req_ctx.put(BindingProvider.USERNAME_PROPERTY, p3Username);
			req_ctx.put(BindingProvider.PASSWORD_PROPERTY, p3Password);
			req_ctx.put("com.sun.xml.internal.ws.request.timeout", 1000 * 60 * 5);
			req_ctx.put("com.sun.xml.internal.ws.connect.timeout", 1000 * 60 * 5);	
			req_ctx.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000 * 60 * 5);
			req_ctx.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000 * 60 * 5);			

			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}	
	
	
	public ModulisticaOnlineApprovalPDF getApproval() throws EPUException {
		try {
			ModulisticaOnlineApprovalPDFService service = new ModulisticaOnlineApprovalPDFService();
			ModulisticaOnlineApprovalPDF port = service.getApprovalPDF();
			Map<String, Object> req_ctx = ((BindingProvider) port).getRequestContext();

			req_ctx.put("com.sun.xml.internal.ws.transport.https.client.SSLSocketFactory", socketFactory);
			req_ctx.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, adobeEndpoint + "soap/services/ModulisticaOnline/ApprovalPDF");
			req_ctx.put(BindingProvider.USERNAME_PROPERTY, p3Username);
			req_ctx.put(BindingProvider.PASSWORD_PROPERTY, p3Password);
			req_ctx.put("com.sun.xml.internal.ws.request.timeout", 1000 * 60 * 5);
			req_ctx.put("com.sun.xml.internal.ws.connect.timeout", 1000 * 60 * 5);	
			req_ctx.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000 * 60 * 5);
			req_ctx.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000 * 60 * 5);
			
			return port;
		} catch (Exception e) {
			throw new EPUException(e);
		}
	}

	public Map<String, String> parseUpload(String res, String out) {
		Map<String, String> result = new TreeMap<String, String>();

		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = null;
		Node node = null;

		try {
			if (res != null) {
				try {
					Document doc2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(res))));

					try {
						expr = xpath.compile("//CodiceOutput");
						node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
						result.put("CodiceOutput", node.getTextContent());
					} catch (Exception e) {}

					try {
						expr = xpath.compile("//DescrizioneOutput");
						node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
						result.put("DescrizioneOutput", node.getTextContent());
					} catch (Exception e) {}
				} catch (Exception e) {}
			}

			if (out != null) {
				try {
					Document doc3 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(out))));

					try {
						expr = xpath.compile("//hash");
						node = (Node) expr.evaluate(doc3, XPathConstants.NODE);
						result.put("hash", node.getTextContent());
					} catch (Exception e) {}

					try {
						expr = xpath.compile("//id_attachment");
						node = (Node) expr.evaluate(doc3, XPathConstants.NODE);
						result.put("id_attachment", node.getTextContent());
					} catch (Exception e) {}

					try {
						expr = xpath.compile("//name");
						node = (Node) expr.evaluate(doc3, XPathConstants.NODE);
						result.put("name", node.getTextContent());
					} catch (Exception e) {}

					try {
						expr = xpath.compile("//type");
						node = (Node) expr.evaluate(doc3, XPathConstants.NODE);
						result.put("type", node.getTextContent());
					} catch (Exception e) {}

				} catch (Exception e) {}
			}
		} catch (Exception e) {}

		return result;
	}

	public Map<String, String> parseGetPDF(String s) {
		Map<String, String> result = new TreeMap<String, String>();

		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = null;
		Node node = null;

		if (s != null) {
		try {
			Document doc1 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(s))));

			String outputData = null;

			try {
				expr = xpath.compile("//faultstring");
				node = (Node) expr.evaluate(doc1, XPathConstants.NODE);
				result.put("faultString", node.getTextContent());
			} catch (Exception e) {}

			try {
				expr = xpath.compile("//out_document_form/remoteURL");
				node = (Node) expr.evaluate(doc1, XPathConstants.NODE);
				String remoteURL = node.getTextContent();
				outputData = getPDFOutput(remoteURL);
			} catch (Exception e) {}

			try {
				Document doc2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(outputData))));

				try {
					expr = xpath.compile("//CodiceOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("CodiceOutput", node.getTextContent());
				} catch (Exception e) {}

				try {
					expr = xpath.compile("//DescrizioneOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("DescrizioneOutput", node.getTextContent());
				} catch (Exception e) {}

			} catch (Exception e) {}

			try {
				expr = xpath.compile("//out_document_pdf/remoteURL");
				node = (Node) expr.evaluate(doc1, XPathConstants.NODE);
				result.put("remotePDF", node.getTextContent());
			} catch (Exception e) {}

		} catch (Exception e) {}
		}

		return result;
	}

	public Map<String, String> parseRemoteGetPDF(String outputData) {
		Map<String, String> result = new TreeMap<String, String>();

		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = null;
		Node node = null;

		if (outputData != null) {
			try {
				Document doc2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(outputData))));

				try {
					expr = xpath.compile("//CodiceOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("CodiceOutput", node.getTextContent());
				} catch (Exception e) {}

				try {
					expr = xpath.compile("//DescrizioneOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("DescrizioneOutput", node.getTextContent());
				} catch (Exception e) {}

			} catch (Exception e) {}
		}

		return result;

	}

	private String getPDFOutput(String outputURL) throws Exception {
		URL url = new URL(outputURL);
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setDoOutput(true);
		con.setDoInput(true);
		con.setRequestMethod("GET");

		InputStream resStream = con.getInputStream();

		BufferedInputStream bis = new BufferedInputStream(resStream);
		StringBuffer sb = new StringBuffer();

		byte buffer[] = new byte[1000];
		int n;
		String b;
		try {
			while ((n = bis.read(buffer)) > -1) {
				b = new String(buffer, 0, n, "UTF-8");
				sb.append(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return sb.toString();

	}

	public Map<String, String> parseApproval(String s) {
		Map<String, String> result = new TreeMap<String, String>();

		XPathFactory factory = XPathFactory.newInstance();
		XPath xpath = factory.newXPath();
		XPathExpression expr = null;
		Node node = null;

		if (s != null) {
			try {
				Document doc2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse((new InputSource(new StringReader(s))));

				try {
					expr = xpath.compile("//CodiceOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("CodiceOutput", node.getTextContent());
				} catch (Exception e) {}

				try {
					expr = xpath.compile("//DescrizioneOutput");
					node = (Node) expr.evaluate(doc2, XPathConstants.NODE);
					result.put("DescrizioneOutput", node.getTextContent());
				} catch (Exception e) {}

			} catch (Exception e) {}
		}
		return result;
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
