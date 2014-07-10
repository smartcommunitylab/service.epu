package it.smartcampuslab.epu.model;

import it.infotn.epu.SegnalazioneType;

import java.util.List;

public class ProtocollaResult {

	private List<SegnalazioneType> segnalazioni;
	private String error;
	private String exception;
	private Object result;
	
	public List<SegnalazioneType> getSegnalazioni() {
		return segnalazioni;
	}
	public void setSegnalazioni(List<SegnalazioneType> segnalazioni) {
		this.segnalazioni = segnalazioni;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getException() {
		return exception;
	}
	public void setException(String exception) {
		this.exception = exception;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	
	

}
