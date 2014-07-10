package it.smartcampuslab.epu.model;

import it.smartcampuslab.epu.storage.DomandaInfo;
import it.smartcampuslab.p3.TypeAutocertificazione;

public class PDFData {

	private DomandaInfo domandaInfo;
	private TypeAutocertificazione autocertificazione;

	public DomandaInfo getDomandaInfo() {
		return domandaInfo;
	}

	public void setDomandaInfo(DomandaInfo domandaInfo) {
		this.domandaInfo = domandaInfo;
	}

	public TypeAutocertificazione getAutocertificazione() {
		return autocertificazione;
	}

	public void setAutocertificazione(TypeAutocertificazione autocertificazione) {
		this.autocertificazione = autocertificazione;
	}

}
