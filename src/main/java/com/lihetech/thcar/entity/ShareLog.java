package com.lihetech.thcar.entity;
/**
 * 分享记录实体类
 * @author hgs
 *
 */
public class ShareLog {
	private int uid;//用户id
	private String share_time;//分享时间
	private String share_content;//分享内容
	private String invite_success_count;//分享成功次数
	private String share_type;
	public ShareLog() {
	}
	public ShareLog(int uid, String share_time, String share_content) {
		super();
		this.uid = uid;
		this.share_time = share_time;
		this.share_content = share_content;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getShare_time() {
		return share_time;
	}

	public void setShare_time(String share_time) {
		this.share_time = share_time;
	}

	public String getShare_content() {
		return share_content;
	}

	public void setShare_content(String share_content) {
		this.share_content = share_content;
	}

	public String getInvite_success_count() {
		return invite_success_count;
	}

	public void setInvite_success_count(String invite_success_count) {
		this.invite_success_count = invite_success_count;
	}
	public String getShare_type() {
		return share_type;
	}
	public void setShare_type(String share_type) {
		this.share_type = share_type;
	}
	@Override
	public String toString() {
		return "ShareLog [uid=" + uid + ", share_time=" + share_time + ", share_content=" + share_content
				+ ", invite_success_count=" + invite_success_count + ", share_type=" + share_type + "]";
	}
}
