package com.lihetech.thcar.entity;

/**
 * 用户实体类
 * 
 * @author hgs
 *
 */
public class User {
	private int uid;
	private String name;
	private String telephone;
	private String nickname;
	private String openID;
	private int isVIP;

	public User() {
		
	}

	public User(String name, String telephone, String nickname, String openID) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.nickname = nickname;
		this.openID = openID;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

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

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getOpenID() {
		return openID;
	}

	public void setOpenID(String openID) {
		this.openID = openID;
	}

	public int getIsVIP() {
		return isVIP;
	}

	public void setIsVIP(int isVIP) {
		this.isVIP = isVIP;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", name=" + name + ", telephone=" + telephone + ", nickname=" + nickname
				+ ", openID=" + openID + ", isVIP=" + isVIP + "]";
	}

}
