package com.lihetech.thcar.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class THCarUtils {
	
	/**
	 * 获取到当前时间
	 * 
	 * @return
	 */
	public static String getCurTime() {
		Date date = new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time = format.format(date);
		return time;
	}
}
