package com.api.modelResponse.Publish;

public class PublishAPIGetResponse {
	
	private PublishAPIGetData data;
	private Integer status;
	private String error;

	public PublishAPIGetData getData() {
		return data;
	}

	public void setData(PublishAPIGetData data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

}
