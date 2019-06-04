package com.prectice.project01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	@RequestMapping("/")	//URL pattern mapping 으로 get이나 post 방식 모두 사용 가능
	public String main(Model model) {
		//Model : 데이터를 담을 그릇 역할, map(키, 값)
		//model.addAttribute("변수","값");
		model.addAttribute("message","저의 홈페이지 입니다");
		return "home";
	}
}
