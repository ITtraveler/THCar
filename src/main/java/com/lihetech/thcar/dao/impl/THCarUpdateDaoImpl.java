package com.lihetech.thcar.dao.impl;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lihetech.thcar.dao.THCarInsertDao;
import com.lihetech.thcar.dao.THCarUpdateDao;

public class THCarUpdateDaoImpl implements THCarUpdateDao{
	@Autowired
	private SqlSessionTemplate sqlSession;
	@Override
	public boolean updateUser(Map<String, String> map) {
		try {
			sqlSession.getMapper(THCarUpdateDao.class).updateUser(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateCarInfo(Map<String, String> map) {
		try {
			sqlSession.getMapper(THCarUpdateDao.class).updateCarInfo(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateShare(Map<String, String> map) {
		try {
			sqlSession.getMapper(THCarUpdateDao.class).updateShare(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
