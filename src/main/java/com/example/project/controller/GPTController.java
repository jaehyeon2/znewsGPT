package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/GPT")
public class GPTController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping({"/", "", "/index"})
	public void gptTest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		logger.info("22222222");
	}
	
}
