package com.jip.ajaxtest2;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home() {
		logger.info("home()");
		
		return "home";
	}
	
	//컨트롤러를 통해 Ajax 요청을 처리할 경우
	//@ResponseBody를 사용해야 함.
	@GetMapping(value = "dataproc",
			produces = "application/text; charset=utf-8")
	@ResponseBody
	public String dataProc(String data) {
		logger.info(data);
		
		return "입력한 데이터는 " + data + " 입니다."; 
	}
}
