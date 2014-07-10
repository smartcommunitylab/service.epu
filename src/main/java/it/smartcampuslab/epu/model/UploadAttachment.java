package it.smartcampuslab.epu.model;

public class UploadAttachment {

	private String hash;
	private Integer id_attachment;
	private String name;
	private String type;

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public Integer getId_attachment() {
		return id_attachment;
	}

	public void setId_attachment(Integer id_attachment) {
		this.id_attachment = id_attachment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
