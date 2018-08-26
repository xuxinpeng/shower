package com.zhengzhou.zhiyuangong.shower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("index")
	public String home() {
		return "index";
	}

	@RequestMapping("main")
	public String main() {
		return "main";
	}

	@RequestMapping("us")
	public String us() {
		return "us";
	}

	@RequestMapping("product")
	public String product() {
		return "product";
	}

	@RequestMapping("problem")
	public String problem() {
		return "problem";
	}

	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}
}
