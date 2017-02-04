package com.lihetech.thcar.dao;

import java.util.List;
import java.util.Map;

import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;

public interface THCarQueryDao {
	//通过手机号查找用户信息(唯一)
	User getUser(String telephone);
	
	//通过qid查询车辆或者通过occupied_uid进行车辆查询
	List<CarInfo> getCarInfo(Map<String,String> map);
	
	//通过用户id获取分享记录
	List<ShareLog> getMyShareLog(Map<String,String> map);
	
	//通过用户id获取反馈记录
	List<Feedback> getMyFeedback(String uid);
	
	//通过operator_uid或car_qid进行挪车记录查询
	List<OperatorLog> getMyTHLog(Map map);
}
