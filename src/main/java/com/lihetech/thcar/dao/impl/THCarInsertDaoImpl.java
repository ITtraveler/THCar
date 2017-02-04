package com.lihetech.thcar.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lihetech.thcar.dao.THCarInsertDao;
import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;

public class THCarInsertDaoImpl implements THCarInsertDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public boolean insertUser(User user) {
		try {
			sqlSession.getMapper(THCarInsertDao.class).insertUser(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertOperatorLog(OperatorLog operatorLog) {
		try {
			sqlSession.getMapper(THCarInsertDao.class).insertOperatorLog(operatorLog);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertCarInfo(CarInfo carInfo) {
		try {
			sqlSession.getMapper(THCarInsertDao.class).insertCarInfo(carInfo);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertFeedback(Feedback feedback) {
		try {
			sqlSession.getMapper(THCarInsertDao.class).insertFeedback(feedback);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean insertShareLog(ShareLog shareLog) {
		try {
			sqlSession.getMapper(THCarInsertDao.class).insertShareLog(shareLog);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	} 


}
