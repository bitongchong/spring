package com.bitongchong.springmvc.hello;



import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes(value="player", types=String.class)
public class ModelAndViewTest {
	@RequestMapping("/modelAndView")
	public ModelAndView modelAndViewTest() {
		ModelAndView modelAndView = new ModelAndView("success");
		modelAndView.addObject("time",new Date());
		return modelAndView;
	}
	
	@RequestMapping("/mapTest")
	public String mapTest(Map<String, Object> map) {
		map.put("name", Arrays.asList("tom","bob","fun"));
		return "success";
	}
	
	@RequestMapping("/mapTest2")
	public String mapTest2(Map<String, Object> map) {
		map.put("player", Arrays.asList("tom","bob","fun","liuyuehe"));
		return "success";
	}
	@RequestMapping("/mapTest3")
	public String mapTest3(Map<String, Object> map) {
		map.put("school", "this is school");
		return "success";
	}
}
