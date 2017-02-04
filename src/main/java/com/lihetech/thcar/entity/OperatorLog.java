package com.lihetech.thcar.entity;

/**
 * 操作日志实体类
 * 
 * @author hgs
 *
 */
public class OperatorLog {
	private String operation_time;// 操作时间
	private String operator_phone;// 操作人电话
	private int operator_uid;// 操作人uid
	private String operator_openID;// 操作人openID（微信得到的id）
	private String car_qid;// 车的qid
	private String car_phone;// 车的电话
	private String car_num;// 车的车牌号
	private String operator_feedback;// 操作人的反馈
	private String location;// 操作位置

	public OperatorLog() {
		// TODO Auto-generated constructor stub
	}

	public OperatorLog(String operation_time, String operator_phone, int operator_uid, String operator_openID,
			String car_qid, String car_phone, String car_num, String operator_feedback, String location) {
		super();
		this.operation_time = operation_time;
		this.operator_phone = operator_phone;
		this.operator_uid = operator_uid;
		this.operator_openID = operator_openID;
		this.car_qid = car_qid;
		this.car_phone = car_phone;
		this.car_num = car_num;
		this.operator_feedback = operator_feedback;
		this.location = location;
	}

	public String getOperation_time() {
		return operation_time;
	}

	public void setOperation_time(String operation_time) {
		this.operation_time = operation_time;
	}

	public String getOperator_phone() {
		return operator_phone;
	}

	public void setOperator_phone(String operator_phone) {
		this.operator_phone = operator_phone;
	}

	public int getOperator_uid() {
		return operator_uid;
	}

	public void setOperator_uid(int operator_uid) {
		this.operator_uid = operator_uid;
	}

	public String getOperator_openID() {
		return operator_openID;
	}

	public void setOperator_openID(String operator_openID) {
		this.operator_openID = operator_openID;
	}

	public String getCar_qid() {
		return car_qid;
	}

	public void setCar_qid(String car_qid) {
		this.car_qid = car_qid;
	}

	public String getCar_phone() {
		return car_phone;
	}

	public void setCar_phone(String car_phone) {
		this.car_phone = car_phone;
	}

	public String getCar_num() {
		return car_num;
	}

	public void setCar_num(String car_num) {
		this.car_num = car_num;
	}

	public String getOperator_feedback() {
		return operator_feedback;
	}

	public void setOperator_feedback(String operator_feedback) {
		this.operator_feedback = operator_feedback;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "OperatorLog [operation_time=" + operation_time + ", operator_phone=" + operator_phone
				+ ", operator_uid=" + operator_uid + ", operator_openID=" + operator_openID + ", car_qid=" + car_qid
				+ ", car_phone=" + car_phone + ", car_num=" + car_num + ", operator_feedback=" + operator_feedback
				+ ", location=" + location + "]";
	}

}
