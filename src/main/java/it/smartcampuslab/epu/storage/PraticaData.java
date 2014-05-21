package it.smartcampuslab.epu.storage;

import org.springframework.data.annotation.Id;

public class PraticaData {

//	@Id
//	private String id;
	
	@Id
	private Long epuDomandaId;
	private String userIdentity;
	private String p3Id;
	private String marcaDaBollo;
	
//	public String getId() {
//		return id;
//	}
//	public void setId(String id) {
//		this.id = id;
//	}
	public Long getEpuDomandaId() {
		return epuDomandaId;
	}
	public void setEpuDomandaId(Long epuDomandaId) {
		this.epuDomandaId = epuDomandaId;
	}
	public String getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(String userIdentity) {
		this.userIdentity = userIdentity;
	}
	public String getP3Id() {
		return p3Id;
	}
	public void setP3Id(String p3Id) {
		this.p3Id = p3Id;
	}
	public String getMarcaDaBollo() {
		return marcaDaBollo;
	}
	public void setMarcaDaBollo(String marcaDaBollo) {
		this.marcaDaBollo = marcaDaBollo;
	}
	
	
	
}
