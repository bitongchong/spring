package com.bitongchong.springmvc.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*RequestMapping既可以修饰方法，也可以修饰类。修饰方法时，直接是相对于/WEB-INF的根目录
而如果是修饰类的话，则类上的mapping相对于/WEB-INF，提供初步的路径映设，然后方法上的mapping
提供进一步路径*/
@RequestMapping("/hello2")
@Controller
public class RequestMappingTest {
	@RequestMapping("/requestTest")
	public String hello() {
		System.out.println("hello world");
		return "success";
	}
	
/*	可以在RequestMapping中添加如下属性，可以屏蔽其他非制定的方法*/
	@RequestMapping(value="/requestMethodTest",method=RequestMethod.POST)
	public String hello2() {
		System.out.println("hello world2");
		return "success";
	}
	
	@RequestMapping(value="/**/requestAntTest",method=RequestMethod.GET)
	public String hello3() {
		System.out.println("hello ant");
		return "success";
	}
	
	@RequestMapping(value="/requestVariableTest/{num}",method=RequestMethod.GET)
	public String hello4(@PathVariable("num") String number) {
		System.out.println("hello pathvariable:	"+number);
		return "success";
	}
}
