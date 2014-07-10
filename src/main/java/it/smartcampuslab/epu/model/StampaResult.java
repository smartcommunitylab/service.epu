package it.smartcampuslab.epu.model;

import it.smartcampuslab.epu.storage.DomandaInfo;

public class StampaResult {

	private DomandaInfo domandaInfo;
	private String link;
	private UploadAttachment attachment;

	public DomandaInfo getDomandaInfo() {
		return domandaInfo;
	}

	public void setDomandaInfo(DomandaInfo domandaInfo) {
		this.domandaInfo = domandaInfo;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public UploadAttachment getAttachment() {
		return attachment;
	}

	public void setAttachment(UploadAttachment attachment) {
		this.attachment = attachment;
	}

}
