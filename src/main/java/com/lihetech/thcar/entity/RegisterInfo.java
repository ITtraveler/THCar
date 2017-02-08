package com.lihetech.thcar.entity;

public class RegisterInfo {
	private String name;
	private String telephone;
	private String prefixRegion;//前缀区域
	private String prefixLetter;//前缀字母
	private String suffixNum;//车牌号码
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPrefixRegion() {
		return prefixRegion;
	}
	public void setPrefixRegion(String prefixRegion) {
		this.prefixRegion = prefixRegion;
	}
	public String getPrefixLetter() {
		return prefixLetter;
	}
	public void setPrefixLetter(String prefixLetter) {
		this.prefixLetter = prefixLetter;
	}
	public String getSuffixNum() {
		return suffixNum;
	}
	public void setSuffixNum(String suffixNum) {
		this.suffixNum = suffixNum;
	}
	@Override
	public String toString() {
		return "RegisterInfo [name=" + name + ", telephone=" + telephone + ", prefixRegion=" + prefixRegion
				+ ", prefixLetter=" + prefixLetter + ", suffixNum=" + suffixNum + "]";
	}
	
}
