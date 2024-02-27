package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.project.service.GPTService;

@Controller
@RequestMapping("/GPT")
public class GPTController {
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private GPTService gptService;
	
	@RequestMapping({"/", "", "/index"})
	public void gptTest(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
		String prompt = gptService.makePrompt("1+1=");
		String result = gptService.receiveAnswer(prompt);
		logger.info("result: " + result);
	}
	
}
