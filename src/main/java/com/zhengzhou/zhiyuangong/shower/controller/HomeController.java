package com.zhengzhou.zhiyuangong.shower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("index")
	public String home() {
		return "index";
	}

	@RequestMapping("footer")
	public String footer() {
		return "footer";
	}

	@RequestMapping("header")
	public String header() {
		return "header";
	}

	@RequestMapping("us")
	public String us() {
		return "us";
	}

	@RequestMapping("product")
	public String product() {
		return "product";
	}

	@RequestMapping("customer")
	public String customer() {
		return "customer";
	}

	@RequestMapping("problem")
	public String problem() {
		return "problem";
	}

	@RequestMapping("contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping("tel")
	public String tel() {
		return "tel";
	}
}
