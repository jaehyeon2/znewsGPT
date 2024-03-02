package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.service.NaverDatalabService;

@Controller
@RequestMapping("/naver-datalab")
public class NaverDatalabController {

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private NaverDatalabService naverDatalabService;

	@RequestMapping({"/", "", "/index"})
	public void test(HttpServletRequest request, HttpServletResponse response) throws Exception{
		logger.info("/naver-datalab");
		naverDatalabService.test();
	}
}
