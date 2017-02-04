package com.lihetech.thcar.dao;

import java.util.Map;

public interface THCarUpdateDao {
	boolean updateUser(Map<String, String> map);

	boolean updateCarInfo(Map<String, String> map);
	
	boolean updateShare(Map<String, String> map);
}
