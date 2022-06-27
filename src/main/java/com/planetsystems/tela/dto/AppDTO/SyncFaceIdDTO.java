package com.planetsystems.tela.dto.AppDTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.planetsystems.tela.dto.ParentDTO;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SyncFaceIdDTO extends ParentDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName;
	private String fileDownloadUri;
	private String refId;

	public SyncFaceIdDTO() {

	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileDownloadUri() {
		return fileDownloadUri;
	}

	public void setFileDownloadUri(String fileDownloadUri) {
		this.fileDownloadUri = fileDownloadUri;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

}
