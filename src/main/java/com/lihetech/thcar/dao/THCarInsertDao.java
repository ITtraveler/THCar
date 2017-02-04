package com.lihetech.thcar.dao;

import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;

public interface THCarInsertDao {
	// 插入一个用户，在注册账号时调用
	boolean insertUser(User user);

	// 插入一条车辆信息
	boolean insertCarInfo(CarInfo carInfo);
	
	// 插入一条操作记录
	boolean insertOperatorLog(OperatorLog operatorLog);

	// 插入一条反馈信息
	boolean insertFeedback(Feedback feedback);
	
	//插入一条分享记录
	boolean insertShareLog(ShareLog shareLog);
}
