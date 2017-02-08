package com.lihetech.thcar.service.impl;

import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lihetech.thcar.dao.THCarUpdateDao;
import com.lihetech.thcar.service.THCarUpdateService;

@Service(value = "THCarUpdateServer")
public class THCarUpdateServiceImpl implements THCarUpdateService {
	@Autowired
	private THCarUpdateDao updateDao;

	@Override
	public boolean updateUser(Map<String, String> map) {
		try {
			updateDao.updateUser(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateCarInfo(Map<String, String> map) {
		try {
			updateDao.updateCarInfo(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean updateShare(Map<String, String> map) {
		try {
			updateDao.updateShare(map);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
