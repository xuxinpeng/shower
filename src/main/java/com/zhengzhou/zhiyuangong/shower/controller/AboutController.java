package com.zhengzhou.zhiyuangong.shower.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/about")
public class AboutController {

	@RequestMapping("/story")
	public String story() {
		return "about/story";
	}
}
