package com.jip.ajaxtest2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class AjaxController {
	//Restful 방식을 사용할 경우 @Controller가 아니라
	//@RestController를 사용하며, 이 때
	//@ResponseBody를 사용하지 않아도 됨.
	
	
	@GetMapping(value = "dataprocrest",
			produces = "application/text; charset=utf-8")
	public String dataProc(String data) {
		log.info(data);
		
		return "입력한 데이터는 " + data + " 입니다."; 
	}
}
