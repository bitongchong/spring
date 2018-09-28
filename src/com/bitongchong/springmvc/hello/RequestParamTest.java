package com.bitongchong.springmvc.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RequestParamTest {
	@RequestMapping(value="/requestParamTest")
	public String requestParam(@RequestParam(value="username")String user,
		@RequestParam(value="password", required=false, defaultValue="this is null") String pass) {
		System.out.println(user+pass);
		return "success";
	}
	
	@RequestMapping("/requestHeader")
	public String headerTest(@RequestHeader(value="Accept-Language") String ln) {
		System.out.println(ln);
		return "success";
	}
}
