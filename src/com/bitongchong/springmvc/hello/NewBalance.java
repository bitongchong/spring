package com.bitongchong.springmvc.hello;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewBalance {
	@RequestMapping(value="/hidden_get", method=RequestMethod.GET)
	public String hiddenHttpTest1() {
		System.out.println("get success");
		return "success";
	}
	
	@RequestMapping(value="/hidden_post", method=RequestMethod.POST)
	public String hiddenHttpTest2() {
		System.out.println("post success");
		return "success";
	}
	
	
	@RequestMapping(value="/hidden_delete/{id}", method=RequestMethod.DELETE)
	public String hiddenHttpTest3(@PathVariable Integer id) {
		System.out.println("delete success"+id);
		return "success";
	}
	
	@ResponseBody
	@RequestMapping(value="/hidden_put/{id}", method=RequestMethod.PUT)
	public String hiddenHttpTest4(@PathVariable Integer id) {
		System.out.println("put success"+id);
		return "success";
	}
}
