package com.zhengzhou.zhiyuangong.shower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/main")
	public String getHome() {
		return "main";
	}

	@RequestMapping("/index")
	public String getIndex() {
		return "index";
	}

}
