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
		try{
			logger.info("강재현");
			logger.info("KANG");
			System.out.println("강재현");
			System.out.println("KANG");
			String result = gptService.receiveAnswer("1+1=");
			logger.info(result);
		}catch(Exception e){
			logger.info("GPTController::gptTest::Error: "+e.getMessage());
		}
	}
	
}
