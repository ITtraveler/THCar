package Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lihetech.thcar.dao.impl.THCarInsertDaoImpl;
import com.lihetech.thcar.dao.impl.THCarQueryDaoImpl;
import com.lihetech.thcar.dao.impl.THCarUpdateDaoImpl;
import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.entity.Feedback;
import com.lihetech.thcar.entity.OperatorLog;
import com.lihetech.thcar.entity.User;

public class TestCar {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-base.xml");

	/****** query ******/
	@Test
	public void thCarRetrieve() {
		THCarQueryDaoImpl thcar = (THCarQueryDaoImpl) context.getBean("THCarQueryDao");
		// get user test
		User user = thcar.getUser("18237603109");
		System.out.println(user);
		// get carInfo test
		Map<String, String> map = new HashMap<String, String>();
		// map.put("qid", "123456");
		map.put("occupied_uid", "2");
		List<CarInfo> carList = thcar.getCarInfo(map);
		for (CarInfo car : carList) {
			System.out.println(car);
		}
	}
	
	@Test
	public void thCarInsert(){
		THCarInsertDaoImpl insertDao = (THCarInsertDaoImpl) context.getBean("THCarInsertDao");

		// user
		 boolean result = insertDao.insertUser(new
		 User("张三","16482648373","jack",""));
		 System.out.println(result);

		// log
		 boolean result2 = insertDao.insertOperatorLog(new OperatorLog("2017-2-4 14:25","18237603109",1,"","123457","18181818182","闽B84787","挪车","福州软件园"));
		 System.out.println(result2);

		// feedback
		 boolean result3 = insertDao.insertFeedback(new Feedback("2017-2-4 14:25", "界面需优化", "1"));
		 System.out.println(result3);

		// car info
		// boolean result4 = insertDao.insertCarInfo(new CarInfo("123460", 2,
		// "浙B49389", "临时停车，请见谅", "1823765637"));
		// System.out.println(result4);

		// share_Log
		// boolean result5 = insertDao.insertShareLog(new ShareLog(1,"2017-2-4
		// 15:12","邀请好友，得20红包"));
		// System.out.println(result5);
	}
	
	@Test
	public void thCarupdate(){
		THCarUpdateDaoImpl updateDao = (THCarUpdateDaoImpl) context.getBean("THCarUpdateDao");
		Map<String, String> map1 = new HashMap<>();
		map1.put("message", "再给我10分值，马上来...");
		map1.put("protecting", "1");
		map1.put("qid", "123456");
		updateDao.updateCarInfo(map1);
		Map<String, String> map2 = new HashMap<>();
		map2.put("share_type", "邀请");
		map2.put("count", "2");
		map2.put("uid", "1");
		updateDao.updateShare(map2);
	}
	

}
