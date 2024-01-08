package com.example.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.project.service.GPTService;

@Controller
public class IndexController {

	@Autowired
	private GPTService gptService;
	
	final Logger logger = LoggerFactory.getLogger(this.getClass());

	
    @RequestMapping(value={"/", "", "/index"}, method=RequestMethod.GET)
	public String index(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
		return "index";
	}

}