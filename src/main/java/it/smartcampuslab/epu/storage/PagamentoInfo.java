package it.smartcampuslab.epu.storage;



public class PagamentoInfo extends DomandaInfo {

	protected String idPagamento;
	protected String modalitaPagamento;
	protected Double importoPagamento;

	public String getIdPagamento() {
		return idPagamento;
	}

	public void setIdPagamento(String marcaDaBollo) {
		this.idPagamento = marcaDaBollo;
	}

	public String getModalitaPagamento() {
		return modalitaPagamento;
	}

	public void setModalitaPagamento(String modalitaPagamento) {
		this.modalitaPagamento = modalitaPagamento;
	}

	public Double getImportoPagamento() {
		return importoPagamento;
	}

	public void setImportoPagamento(Double importoPagamento) {
		this.importoPagamento = importoPagamento;
	}

	@Override
	public String toString() {
		return id + "." + idPagamento + "(" + userIdentity + ")";
	}
	

}
