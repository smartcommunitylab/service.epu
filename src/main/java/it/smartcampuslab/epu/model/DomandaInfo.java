package it.smartcampuslab.epu.model;


public class DomandaInfo {

	private Long id;
	private Integer version;
	private String userIdentity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public String getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	@Override
	public String toString() {
		return id + "." + version + "(" + userIdentity + ")";
	}

}
