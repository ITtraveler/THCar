package com.lihetech.thcar.service.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihetech.thcar.dao.THCarQueryDao;
import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.ShareLog;
import com.lihetech.thcar.entity.User;
import com.lihetech.thcar.service.THCarQueryService;

@Service(value="THCarQueryServer")
public class THCarQueryServiceImpl implements THCarQueryService{
	@Autowired
	private THCarQueryDao queryDao;

	
	@Override
	public User getUser(String telephone) {
		//return sqlSession.selectOne("com.lihetech.thcar.dao.THCarDao.getUser",telephone);
		return queryDao.getUser(telephone);
	}

	@Override
	public List<CarInfo> getCarInfo(Map<String,String> map) {
		return queryDao.getCarInfo(map);
	}

	@Override
	public List<ShareLog> getMyShareLog(Map<String,String> map) {
		return queryDao.getMyShareLog(map);
	}

	@Override
	public List<Feedback> getMyFeedback(String uid) {
		return queryDao.getMyFeedback(uid);
	}

	@Override
	public List<OperatorLog> getMyTHLog(Map<String,String> map) {
		return queryDao.getMyTHLog(map);
	}
	

}
