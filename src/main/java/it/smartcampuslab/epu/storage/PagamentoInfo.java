package it.smartcampuslab.epu.storage;


public class PagamentoInfo {

	private Long id;
	private String marcaDaBollo;
	private String userIdentity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMarcaDaBollo() {
		return marcaDaBollo;
	}

	public void setMarcaDaBollo(String marcaDaBollo) {
		this.marcaDaBollo = marcaDaBollo;
	}

	public String getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	
	@Override
	public String toString() {
		return id + "." + marcaDaBollo + "(" + userIdentity + ")";
	}
	

}
