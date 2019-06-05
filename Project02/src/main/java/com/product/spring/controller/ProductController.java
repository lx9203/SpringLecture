package com.product.spring.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.product.spring.shop.service.ProductService;

@Controller
//@RequestMapping("shop/product/*") //공통적인 url mapping
public class ProductController {
	
	@Inject
	ProductService productService;
	
	@RequestMapping("/")
	public String shopMain(Model model) {
		return "include/filemenu";
	}
	
	@RequestMapping("shop/product/list.do")
	public ModelAndView list(ModelAndView mav) {
		mav.setViewName("/shop/product/product_list");	// 이동할 페이지
		mav.addObject("list", productService.listProduct()); // 데이터 저장
		return mav; // 페이지 이동
	}
	
	
}
