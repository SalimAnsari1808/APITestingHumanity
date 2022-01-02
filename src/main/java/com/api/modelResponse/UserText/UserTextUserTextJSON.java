package com.api.modelResponse.UserText;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserTextUserTextJSON {
	
	private String bodyText;
	private String headingText;
	private String acceptBtnText;
	private String rejectBtnText;
	private String revokeBtnText;
	//private String revokeMessage;
	//private String cookiesBtnText;
	//private String declineBtnText;
	private String privacyBtnText;
	//private String privacyPolicyBtnText;
	private String dontSellBtnText;
	private String dontSellBodyText;
	private String privacyBodyText;
	private String customizeBtnText;
	private String preferencesHeadingText;
	private String preferencesBodyText;

	public String getBodyText() {
		return bodyText;
	}

	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}

	public String getHeadingText() {
		return headingText;
	}

	public void setHeadingText(String headingText) {
		this.headingText = headingText;
	}

	public String getAcceptBtnText() {
		return acceptBtnText;
	}

	public void setAcceptBtnText(String acceptBtnText) {
		this.acceptBtnText = acceptBtnText;
	}

//	public String getRefuseBtnText() {
//		return refuseBtnText;
//	}
//
//	public void setRefuseBtnText(String refuseBtnText) {
//		this.refuseBtnText = refuseBtnText;
//	}

	public String getRevokeBtnText() {
		return revokeBtnText;
	}

	public void setRevokeBtnText(String revokeBtnText) {
		this.revokeBtnText = revokeBtnText;
	}

//	public String getRevokeMessage() {
//		return revokeMessage;
//	}
//
//	public void setRevokeMessage(String revokeMessage) {
//		this.revokeMessage = revokeMessage;
//	}
//
//	public String getCookiesBtnText() {
//		return cookiesBtnText;
//	}
//
//	public void setCookiesBtnText(String cookiesBtnText) {
//		this.cookiesBtnText = cookiesBtnText;
//	}
//
//	public String getDeclineBtnText() {
//		return declineBtnText;
//	}
//
//	public void setDeclineBtnText(String declineBtnText) {
//		this.declineBtnText = declineBtnText;
//	}

	public String getPrivacyBtnText() {
		return privacyBtnText;
	}

	public void setPrivacyBtnText(String privacyBtnText) {
		this.privacyBtnText = privacyBtnText;
	}

	public String getRejectBtnText() {
		return rejectBtnText;
	}

	public void setRejectBtnText(String rejectBtnText) {
		this.rejectBtnText = rejectBtnText;
	}

	public String getDontSellBtnText() {
		return dontSellBtnText;
	}

	public void setDontSellBtnText(String dontSellBtnText) {
		this.dontSellBtnText = dontSellBtnText;
	}

	public String getDontSellBodyText() {
		return dontSellBodyText;
	}

	public void setDontSellBodyText(String dontSellBodyText) {
		this.dontSellBodyText = dontSellBodyText;
	}

	public String getPrivacyBodyText() {
		return privacyBodyText;
	}

	public void setPrivacyBodyText(String privacyBodyText) {
		this.privacyBodyText = privacyBodyText;
	}

	public String getCustomizeBtnText() {
		return customizeBtnText;
	}

	public void setCustomizeBtnText(String customizeBtnText) {
		this.customizeBtnText = customizeBtnText;
	}

	public String getPreferencesHeadingText() {
		return preferencesHeadingText;
	}

	public void setPreferencesHeadingText(String preferencesHeadingText) {
		this.preferencesHeadingText = preferencesHeadingText;
	}

	public String getPreferencesBodyText() {
		return preferencesBodyText;
	}

	public void setPreferencesBodyText(String preferencesBodyText) {
		this.preferencesBodyText = preferencesBodyText;
	}

//	public String getPrivacyPolicyBtnText() {
//		return privacyPolicyBtnText;
//	}
//
//	public void setPrivacyPolicyBtnText(String privacyPolicyBtnText) {
//		this.privacyPolicyBtnText = privacyPolicyBtnText;
//	}
	
}
