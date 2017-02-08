package Test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lihetech.thcar.dao.impl.THCarOtherDaoImpl;
import com.lihetech.thcar.util.THCarUtils;

public class THCarTest {
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-base.xml");

	/**
	 * 创建THID
	 */
	@Test
	public void createTHID() {
		THCarOtherDaoImpl otherDao = (THCarOtherDaoImpl) context.getBean("THCarOtherDao");
		for (int i = 0; i < 1000; i++) {
			String result = THCarUtils.createRandomTHID();
			boolean other = otherDao.insertTHid(result);
			System.out.println(other);
		}
	}
}
