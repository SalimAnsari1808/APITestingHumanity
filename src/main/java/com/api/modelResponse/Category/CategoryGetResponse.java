package com.api.modelResponse.Category;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class CategoryGetResponse {
	
	private List<CategoryGetDataResponse> data = null;
	private Integer status;

	public List<CategoryGetDataResponse> getData() {
		return data;
	}

	public void setData(List<CategoryGetDataResponse> data) {
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
