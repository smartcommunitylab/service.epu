package it.smartcampuslab.epu.storage;

public class DomandaInfo {

	protected Long idDomanda;
	protected String userIdentity;
	protected Integer version;

	public Long getIdDomanda() {
		return idDomanda;
	}

	public void setIdDomanda(Long id) {
		this.idDomanda = id;
	}

	public String getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return idDomanda + "(" + userIdentity + ")." + version;
	}

}
