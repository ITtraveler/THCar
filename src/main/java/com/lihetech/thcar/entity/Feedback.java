package com.lihetech.thcar.entity;
/**
 * 反馈信息实体类
 * @author hgs
 *
 */
public class Feedback {
	private String fb_time;//反馈时间
	private String fb_content;//反馈内容
	private String fb_uid;//反馈用户id
	public Feedback() {
		// TODO Auto-generated constructor stub
	}
	public Feedback(String fb_time, String fb_content, String fb_uid) {
		super();
		this.fb_time = fb_time;
		this.fb_content = fb_content;
		this.fb_uid = fb_uid;
	}
	public String getFb_time() {
		return fb_time;
	}
	public void setFb_time(String fb_time) {
		this.fb_time = fb_time;
	}
	public String getFb_content() {
		return fb_content;
	}
	public void setFb_content(String fb_content) {
		this.fb_content = fb_content;
	}
	public String getFb_uid() {
		return fb_uid;
	}
	public void setFb_uid(String fb_uid) {
		this.fb_uid = fb_uid;
	}
	@Override
	public String toString() {
		return "Feedback [fb_time=" + fb_time + ", fb_content=" + fb_content + ", fb_uid=" + fb_uid + "]";
	}
	
	
}
