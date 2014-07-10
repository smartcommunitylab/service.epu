package it.smartcampuslab.epu.model;

import java.util.ArrayList;
import java.util.List;

public class ElenchiOutput {

	private List<ElenchiItem> ambitiTerritoriali;
	private List<ElenchiItem> comuni;
	private List<ElenchiItem> edizioniFinanziate;
	
	public ElenchiOutput() {
		ambitiTerritoriali = new ArrayList<ElenchiItem>();
		comuni = new ArrayList<ElenchiItem>();
		edizioniFinanziate = new ArrayList<ElenchiItem>();
	}
	
	public List<ElenchiItem> getAmbitiTerritoriali() {
		return ambitiTerritoriali;
	}
	public void setAmbitiTerritoriali(List<ElenchiItem> ambitiTerritoriali) {
		this.ambitiTerritoriali = ambitiTerritoriali;
	}
	public List<ElenchiItem> getComuni() {
		return comuni;
	}
	public void setComuni(List<ElenchiItem> comuni) {
		this.comuni = comuni;
	}

	public List<ElenchiItem> getEdizioniFinanziate() {
		return edizioniFinanziate;
	}

	public void setEdizioniFinanziate(List<ElenchiItem> edizioniFinanziate) {
		this.edizioniFinanziate = edizioniFinanziate;
	}

	

}
