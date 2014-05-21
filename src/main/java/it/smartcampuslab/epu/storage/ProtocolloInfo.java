package it.smartcampuslab.epu.storage;


public class ProtocolloInfo {

	private Long id;
	private String protocollo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProtocollo() {
		return protocollo;
	}

	public void setProtocollo(String protocollo) {
		this.protocollo = protocollo;
	}
	
	@Override
	public String toString() {
		return id + "." + protocollo;
	}

}
