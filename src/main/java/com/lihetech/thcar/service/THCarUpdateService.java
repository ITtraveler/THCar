package com.lihetech.thcar.service;

import java.util.Map;

public interface THCarUpdateService {
	boolean updateUser(Map<String, String> map);

	boolean updateCarInfo(Map<String, String> map);
	
	boolean updateShare(Map<String, String> map);
}
