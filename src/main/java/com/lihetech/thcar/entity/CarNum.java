package com.lihetech.thcar.entity;

/**
 * @author hgs
 * 车牌号
 */
public class CarNum {
	private String prefixRegion;//前缀区域
	private String prefixLetter;//前缀字母
	private String suffixNum;//车牌号码
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
		return prefixRegion+prefixLetter+suffixNum;
	}
}
