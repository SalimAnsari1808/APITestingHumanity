package com.api.modelRequest.UserDesign;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect(
fieldVisibility=JsonAutoDetect.Visibility.ANY, 
getterVisibility=JsonAutoDetect.Visibility.NONE, 
setterVisibility=JsonAutoDetect.Visibility.NONE, 
creatorVisibility=JsonAutoDetect.Visibility.NONE)
public class UserDesignUserDesignJSON {
	
	private String 	textSize;
	private String 	headingSize;
	private String 	position;
	private String 	animation;
	private String 	animationSpeed;
	private String 	textColor;
	private String 	headingColor;
	private String 	primaryColor;
	private String 	bannerColor;
	private Integer bannerOpacity;
	private String 	btnTextColor;

	public String getTextSize() {
		return textSize;
	}

	public void setTextSize(String textSize) {
		this.textSize = textSize;
	}

	public String getHeadingSize() {
		return headingSize;
	}

	public void setHeadingSize(String headingSize) {
		this.headingSize = headingSize;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAnimation() {
		return animation;
	}

	public void setAnimation(String animation) {
		this.animation = animation;
	}

	public String getAnimationSpeed() {
		return animationSpeed;
	}

	public void setAnimationSpeed(String animationSpeed) {
		this.animationSpeed = animationSpeed;
	}

	public String getTextColor() {
		return textColor;
	}

	public void setTextColor(String textColor) {
		this.textColor = textColor;
	}

	public String getHeadingColor() {
		return headingColor;
	}

	public void setHeadingColor(String headingColor) {
		this.headingColor = headingColor;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

//	public String getSecondaryColor() {
//		return secondaryColor;
//	}
//
//	public void setSecondaryColor(String secondaryColor) {
//		this.secondaryColor = secondaryColor;
//	}

	public String getBannerColor() {
		return bannerColor;
	}

	public void setBannerColor(String bannerColor) {
		this.bannerColor = bannerColor;
	}

	public Integer getBannerOpacity() {
		return bannerOpacity;
	}

	public void setBannerOpacity(Integer bannerOpacity) {
		this.bannerOpacity = bannerOpacity;
	}

	public String getBtnTextColor() {
		return btnTextColor;
	}

	public void setBtnTextColor(String btnTextColor) {
		this.btnTextColor = btnTextColor;
	}
}
