package com.example.spring01.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring01.model.dto.ProductDTO;

@Controller
public class MainController {
	
	@RequestMapping("/")	//URL pattern mapping 으로 get이나 post 방식 모두 사용 가능
	public String main(Model model) {
		//Model : 데이터를 담을 그릇 역할, map(키, 값)
		//model.addAttribute("변수","값");
		model.addAttribute("message","저의 홈페이지 입니다");
		return "main";
	}
	
	@RequestMapping(value="gugu.do", method=RequestMethod.GET)
	public String gugu(int dan, Model model) {
		String result="";
		for(int i=1; i<9; i++) {
			result += dan + "X" + i + "=" + (dan*i) + "<br>";
		}
		model.addAttribute("result", result);
		return "test/gugu";
	}
	
	@RequestMapping("test")
//	리턴 타입이 void 인 경우 RuquestMapping과 동일한 페이지로 이동
	public void test() {
		
		
	}
	
	//test/doA 매핑시키기
	@RequestMapping("test/doA")
	public String doA(Model model) {
		model.addAttribute("message", "안녕하세요. 환영합니다.");
		return "test/doB";
	}
	
	//test/doB 매핑시키기
	@RequestMapping("test/doB")
	public void doB() {
		System.out.println("두비두비두비");
	}
	
	//ModelAndView 로 객체와 출력페이지를 함께 가지고 전달
	//Model : 데이터 저장소, View : 화면
	//데이터와 포워드할 페이지 정보 함께 전달
	//forward	: 주소 그대로 화면전환, 대량의 데이터 전달
	//redirect	: 주소 바뀌고 화면전환, 소량의 get 방식
	
	//test/doC 매핑시키기
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("product", new ProductDTO("샤프", 1000));
		return new ModelAndView("test/doC", "map", map);
	}

}
