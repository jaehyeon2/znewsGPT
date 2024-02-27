package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.service.NaverDatalabService;

@Controller
@RequestMapping("/naver-datalab")
public class NaverDatalabController {

	@Autowired
	private NaverDatalabService naverDatalabService; 
	
	@RequestMapping({"/"})
	public void test(){
		naverDatalabService.test();
		
	}
}
