package com.example.project.service.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.project.service.GPTService;

@Service
public class GPTServiceImpl implements GPTService {

	final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private String HEAD_PROMPT;
	
	@Autowired
	private String TAIL_PROMPT;
	
	@Autowired
    private String apiUrl;
	
	@Autowired
    private String apiKey;
	
	
	final private StringBuffer PROMPT_QUESTION = new StringBuffer();
	
	@Override
	public String makePrompt(String content) throws Exception {
		
		PROMPT_QUESTION.delete(0, PROMPT_QUESTION.length());
		
//		PROMPT_QUESTION.append(HEAD_PROMPT);
		PROMPT_QUESTION.append(content);
//		PROMPT_QUESTION.append(TAIL_PROMPT);
		
		return PROMPT_QUESTION.toString();
		
	}
	
	@Override
	public String receiveAnswer(String prompt) throws Exception {
		
		StringBuffer response = new StringBuffer();
		HttpURLConnection connection = null;
		
		
		try {
            
			// request prompt JSON type data
			String requestData = "{\"prompt\": \"" + prompt + "\"}";

			// URL Connection
			URL url = new URL(apiUrl);
			connection = (HttpURLConnection) url.openConnection();

			// HTTP Method POST
			connection.setRequestMethod("POST");

			// HTTP 
			connection.setRequestProperty("Content-Type", "application/json");
			connection.setRequestProperty("Authorization", "Bearer " + apiKey);

			// Result
			connection.setDoOutput(true);
			try (OutputStream os = connection.getOutputStream()) {
				byte[] input = requestData.getBytes("utf-8");
				os.write(input, 0, input.length);
			}
			BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			try {
			
				String line;
				while ((line = reader.readLine()) != null) {
					response.append(line);
				}
				logger.info(response.toString());
			}catch(Error e){
				logger.info("error");
			}finally{
				reader.close();
			}
			logger.info("강재현");
			logger.info("KANG");
		} catch (IOException e) {
			
			logger.info("GPTServiceImpl::receiveAnswer::Error: " + e.getMessage());
			
		}finally {
			
			connection.disconnect();
			logger.info("GPTServiceImpl::receiveAnswer:connection successly disconnected!!");
			
		}
		
		
		return response.toString();
	}

}
