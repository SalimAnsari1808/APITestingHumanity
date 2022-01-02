package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignBannerConfigJSON {
	
	private Boolean rejectConsent;
	private Boolean customizeConsent;
	private Boolean revokeConsent;
	private String 	revokeMethod;
	private String 	revokePosition;
	private Boolean preferencesVisible;
	private Boolean privacyPolicyLink;
	private String 	privacyLinkPosition;
	private String 	privacyPolicyUrl;
	private String 	privacyLinkTarget;
	private Boolean dontSellLink;
	private String 	dontSellLinkPosition;
	private String 	dontSellLinkTarget;
	private Boolean geolocation;
	private Boolean onClose;
	private Boolean onClick;
	private Boolean onScroll;
	private Integer scrollOffset;
	private Boolean uiBlocking;
	private Boolean reloading;
	private Integer acceptExpiry;
	private Integer rejectExpiry;

	public Boolean getRejectConsent() {
		return rejectConsent;
	}

	public void setRejectConsent(Boolean rejectConsent) {
		this.rejectConsent = rejectConsent;
	}

	public Boolean getCustomizeConsent() {
		return customizeConsent;
	}

	public void setCustomizeConsent(Boolean customizeConsent) {
		this.customizeConsent = customizeConsent;
	}

	public Boolean getRevokeConsent() {
		return revokeConsent;
	}

	public void setRevokeConsent(Boolean revokeConsent) {
		this.revokeConsent = revokeConsent;
	}

	public String getRevokeMethod() {
		return revokeMethod;
	}

	public void setRevokeMethod(String revokeMethod) {
		this.revokeMethod = revokeMethod;
	}

	public String getRevokePosition() {
		return revokePosition;
	}

	public void setRevokePosition(String revokePosition) {
		this.revokePosition = revokePosition;
	}

	public Boolean getPreferencesVisible() {
		return preferencesVisible;
	}

	public void setPreferencesVisible(Boolean preferencesVisible) {
		this.preferencesVisible = preferencesVisible;
	}

	public Boolean getPrivacyPolicyLink() {
		return privacyPolicyLink;
	}

	public void setPrivacyPolicyLink(Boolean privacyPolicyLink) {
		this.privacyPolicyLink = privacyPolicyLink;
	}

	public String getPrivacyLinkPosition() {
		return privacyLinkPosition;
	}

	public void setPrivacyLinkPosition(String privacyLinkPosition) {
		this.privacyLinkPosition = privacyLinkPosition;
	}

	public String getPrivacyPolicyUrl() {
		return privacyPolicyUrl;
	}

	public void setPrivacyPolicyUrl(String privacyPolicyUrl) {
		this.privacyPolicyUrl = privacyPolicyUrl;
	}

	public String getPrivacyLinkTarget() {
		return privacyLinkTarget;
	}

	public void setPrivacyLinkTarget(String privacyLinkTarget) {
		this.privacyLinkTarget = privacyLinkTarget;
	}

	public Boolean getDontSellLink() {
		return dontSellLink;
	}

	public void setDontSellLink(Boolean dontSellLink) {
		this.dontSellLink = dontSellLink;
	}

	public String getDontSellLinkPosition() {
		return dontSellLinkPosition;
	}

	public void setDontSellLinkPosition(String dontSellLinkPosition) {
		this.dontSellLinkPosition = dontSellLinkPosition;
	}

	public String getDontSellLinkTarget() {
		return dontSellLinkTarget;
	}

	public void setDontSellLinkTarget(String dontSellLinkTarget) {
		this.dontSellLinkTarget = dontSellLinkTarget;
	}

	public Boolean getGeolocation() {
		return geolocation;
	}

	public void setGeolocation(Boolean geolocation) {
		this.geolocation = geolocation;
	}

	public Boolean getOnClose() {
		return onClose;
	}

	public void setOnClose(Boolean onClose) {
		this.onClose = onClose;
	}

	public Boolean getOnClick() {
		return onClick;
	}

	public void setOnClick(Boolean onClick) {
		this.onClick = onClick;
	}

	public Boolean getOnScroll() {
		return onScroll;
	}

	public void setOnScroll(Boolean onScroll) {
		this.onScroll = onScroll;
	}

	public Integer getScrollOffset() {
		return scrollOffset;
	}

	public void setScrollOffset(Integer scrollOffset) {
		this.scrollOffset = scrollOffset;
	}

	public Boolean getUiBlocking() {
		return uiBlocking;
	}

	public void setUiBlocking(Boolean uiBlocking) {
		this.uiBlocking = uiBlocking;
	}

	public Boolean getReloading() {
		return reloading;
	}

	public void setReloading(Boolean reloading) {
		this.reloading = reloading;
	}

	public Integer getAcceptExpiry() {
		return acceptExpiry;
	}

	public void setAcceptExpiry(Integer acceptExpiry) {
		this.acceptExpiry = acceptExpiry;
	}

	public Integer getRejectExpiry() {
		return rejectExpiry;
	}

	public void setRejectExpiry(Integer rejectExpiry) {
		this.rejectExpiry = rejectExpiry;
	}
}
