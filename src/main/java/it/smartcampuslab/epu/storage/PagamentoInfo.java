package it.smartcampuslab.epu.storage;

public class PagamentoInfo extends DomandaInfo {

	protected String identificativo;
	protected String oraEmissione;
	protected String giornoEmissione;
	protected Boolean esenzione =  Boolean.FALSE;
	protected String motivo;

	public String getIdentificativo() {
		return identificativo;
	}

	public void setIdentificativo(String identificativo) {
		this.identificativo = identificativo;
	}

	public String getOraEmissione() {
		return oraEmissione;
	}

	public void setOraEmissione(String oraEmissione) {
		this.oraEmissione = oraEmissione;
	}

	public String getGiornoEmissione() {
		return giornoEmissione;
	}

	public void setGiornoEmissione(String giornoEmissione) {
		this.giornoEmissione = giornoEmissione;
	}

	public Boolean getEsenzione() {
		return esenzione;
	}

	public void setEsenzione(Boolean esenzione) {
		this.esenzione = esenzione;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Override
	public String toString() {
		return idDomanda + "." + identificativo + "(" + userIdentity + ")";
	}

}
