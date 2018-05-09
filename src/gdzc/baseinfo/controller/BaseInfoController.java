package gdzc.baseinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/baseinfo")
public class BaseInfoController {
	@RequestMapping("demo")
	public String demo(){
		return "demo";
	}
}
