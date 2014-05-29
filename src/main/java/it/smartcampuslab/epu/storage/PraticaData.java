package it.smartcampuslab.epu.storage;


public class PraticaData extends PagamentoInfo {

	protected String p3Id;
	protected long data;
	protected Status status;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getP3Id() {
		return p3Id;
	}

	public void setP3Id(String p3Id) {
		this.p3Id = p3Id;
	}

	public long getData() {
		return data;
	}

	public void setData(long data) {
		this.data = data;
	}

	
}
