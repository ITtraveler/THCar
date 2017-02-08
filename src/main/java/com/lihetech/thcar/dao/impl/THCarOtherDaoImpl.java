package com.lihetech.thcar.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.lihetech.thcar.dao.THCarOtherDao;

public class THCarOtherDaoImpl implements THCarOtherDao {
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public boolean insertTHid(String thid) {
		try {
			sqlSession.getMapper(THCarOtherDao.class).insertTHid(thid);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
