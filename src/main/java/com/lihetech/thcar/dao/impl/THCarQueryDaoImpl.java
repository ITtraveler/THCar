package com.lihetech.thcar.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lihetech.thcar.dao.THCarQueryDao;
import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;

public class THCarQueryDaoImpl implements THCarQueryDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public User getUser(String telephone) {
		//return sqlSession.selectOne("com.lihetech.thcar.dao.THCarDao.getUser",telephone);
		return sqlSession.getMapper(THCarQueryDao.class).getUser(telephone);
	}

	@Override
	public List<CarInfo> getCarInfo(Map map) {
		return sqlSession.getMapper(THCarQueryDao.class).getCarInfo(map);
	}

	@Override
	public List<ShareLog> getMyShareLog(Map map) {
		return sqlSession.getMapper(THCarQueryDao.class).getMyShareLog(map);
	}

	@Override
	public List<Feedback> getMyFeedback(String uid) {
		return sqlSession.getMapper(THCarQueryDao.class).getMyFeedback(uid);
	}

	@Override
	public List<OperatorLog> getMyTHLog(Map map) {
		return sqlSession.getMapper(THCarQueryDao.class).getMyTHLog(map);
	}
	

}
