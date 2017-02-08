package com.lihetech.thcar.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lihetech.thcar.entity.CarInfo;
import com.lihetech.thcar.service.impl.THCarQueryServiceImpl;

/**
 * 用于别人扫描二维码后的控制器
 * 
 * @author hgs
 *
 */
@Controller
public class THCarTouchContraller {
	@Autowired
	THCarQueryServiceImpl queryService;

	/**
	 * 验证码扫描后跳这里
	 * 
	 * @param thid
	 *            树洞ID，唯一标识
	 * @return
	 */
	@RequestMapping("/identity/{thid}")
	public String thCarTouchStepOne(@PathVariable("thid") String thid, Map<String, Object> map) {
		Map<String, String> mParam = new HashMap<>();
		mParam.put("thid", thid);
		List<CarInfo> carList = queryService.getCarInfo(mParam);
		if (carList != null && carList.size() > 0) {
			CarInfo carInfo = carList.get(0);
			map.put("carInfo", carInfo);// 将carInfo放入session域中
			// 判断此thid是否被绑定
			if (carInfo != null && carInfo.getCar_num() != null && !"".equals(carInfo.getCar_num().trim())) {// 已绑定
				map.put("message", carInfo.getMessage().trim());
				System.out.println(carInfo);
				return "thcar_touch1";
			} else {// 未绑定
				return "register01";
			}
		}
		return "error";
	}

}
