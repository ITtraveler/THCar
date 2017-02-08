package com.lihetech.thcar.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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

//	public static String getARandomTHID(){
//		
//	}
	/**
	 * 产生一个随机THID
	 * 
	 * @return
	 */
	public static String createRandomTHID() {
		
		return randomNum()+randomAZ()+randomNum()+randomAZ();
	}

	private static String randomNum() {
		Random r = new Random();
		String num = Integer.toString(r.nextInt(109));
		if (num.length() < 3)
			num = num.length() == 1 ? "00" + num : "0" + num;
		return num;
	}

	private static String randomAZ() {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		return "" + chars.charAt((int) (Math.random() * 26));
	}
}
