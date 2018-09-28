package com.bitongchong.springmvc.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitongchong.springmvc.bean.User;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
	
	@RequestMapping("/userInfo")
	public String userInfo(User user) {
		System.out.println(user);
		return "success";
	}
	
	@RequestMapping("/viewTest")
	public String viewTest() {
		System.out.println("testView");
		return "helloView";
	}
	@RequestMapping("/viewRedirectTest2")
	public String viewTest2() {
		System.out.println("testView");
		return "redirect:/index.jsp";
	}
	
	
}
