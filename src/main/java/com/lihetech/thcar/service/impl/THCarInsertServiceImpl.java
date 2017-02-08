package com.lihetech.thcar.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihetech.thcar.dao.THCarInsertDao;
import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;

@Service(value = "THCarInsertServer")
public class THCarInsertServiceImpl implements THCarInsertDao {
	@Autowired
	private THCarInsertDao insertDao;

	@Override
	public boolean insertUser(User user) {
		try {
			insertDao.insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertOperatorLog(OperatorLog operatorLog) {
		try {
			insertDao.insertOperatorLog(operatorLog);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertCarInfo(CarInfo carInfo) {
		try {
			insertDao.insertCarInfo(carInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertFeedback(Feedback feedback) {
		try {
			insertDao.insertFeedback(feedback);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertShareLog(ShareLog shareLog) {
		try {
			insertDao.insertShareLog(shareLog);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
