package it.smartcampuslab.epu.storage;

import org.springframework.data.annotation.Id;


public class DomandaInfo {

	@Id
	protected Long id;
	protected String userIdentity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}

	@Override
	public String toString() {
		return id + "(" + userIdentity + ")";
	}

}
