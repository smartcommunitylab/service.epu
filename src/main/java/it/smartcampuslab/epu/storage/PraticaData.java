package it.smartcampuslab.epu.storage;

import java.util.Map;


public class PraticaData extends PagamentoInfo {

	protected Integer p3Id;
	protected String p3Hash;
	protected long data;
	protected Status status;
	protected String token;
	protected String email;
	protected long epuTime;
	protected Map<String, Object> autocertificazione;
	
	protected boolean deleted = false;
	

	public Integer getP3Id() {
		return p3Id;
	}

	public void setP3Id(Integer p3Id) {
		this.p3Id = p3Id;
	}

	public String getP3Hash() {
		return p3Hash;
	}

	public void setP3Hash(String p3Hash) {
		this.p3Hash = p3Hash;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getEpuTime() {
		return epuTime;
	}

	public void setEpuTime(long epuTime) {
		this.epuTime = epuTime;
	}

	public Map<String, Object> getAutocertificazione() {
		return autocertificazione;
	}

	public void setAutocertificazione(Map<String, Object> autocertificazione) {
		this.autocertificazione = autocertificazione;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

}
