package com.api.modelResponse.Payment;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect(
		fieldVisibility=JsonAutoDetect.Visibility.ANY, 
		getterVisibility=JsonAutoDetect.Visibility.NONE, 
		setterVisibility=JsonAutoDetect.Visibility.NONE, 
		creatorVisibility=JsonAutoDetect.Visibility.NONE
	)
public class PaymentBrainTreeGetResponse {

	private String token;
	private List<PaymentBrainTreePlan> plans = null;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<PaymentBrainTreePlan> getPlans() {
		return plans;
	}

	public void setPlans(List<PaymentBrainTreePlan> plans) {
		this.plans = plans;
	}
}
