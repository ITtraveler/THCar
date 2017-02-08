package com.lihetech.thcar.entity;

/**
 * 车辆信息实体类
 * 
 * @author hgs
 *
 */

public class CarInfo {
	private int id;
	private String thid;// 二维码的一个唯一id(树洞编号)
	private int occupied_uid;// 绑定的用户id
	private String car_num;// 车牌号
	private String message;// 留言
	private String telephone;// 电话
	private int protecting;// 是否隐私保护

	public CarInfo() {
		// TODO Auto-generated constructor stub
	}

	public CarInfo(String thid, int occupied_uid, String car_num, String message, String telephone) {
		super();
		this.thid = thid;
		this.occupied_uid = occupied_uid;
		this.car_num = car_num;
		this.message = message;
		this.telephone = telephone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getThid() {
		return thid;
	}

	public void setThid(String thid) {
		this.thid = thid;
	}

	public int getOccupied_uid() {
		return occupied_uid;
	}

	public void setOccupied_uid(int occupied_uid) {
		this.occupied_uid = occupied_uid;
	}

	public String getCar_num() {
		return car_num;
	}

	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getProtecting() {
		return protecting;
	}

	public void setProtecting(int protecting) {
		this.protecting = protecting;
	}

	@Override
	public String toString() {
		return "CarInfo [id=" + id + ", thid=" + thid + ", occupied_uid=" + occupied_uid + ", car_num=" + car_num
				+ ", message=" + message + ", telephone=" + telephone + ", protecting=" + protecting + "]";
	}

}
