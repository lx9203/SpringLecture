package com.example.spring02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.spring02.model.dto.ProductDTO;

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
	
	@RequestMapping("test/doB")
	public void doB() {
		System.out.println("doB");
	}
	
	@RequestMapping("test/doC")
	public ModelAndView doC() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Product", new ProductDTO("샤프", 1000));
		return new ModelAndView("test/doC", "map", map);
	}
	
}
