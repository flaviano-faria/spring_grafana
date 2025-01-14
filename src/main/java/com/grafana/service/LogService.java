package com.grafana.service;

import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	 private final Logger LOG = (Logger) LoggerFactory.getLogger(LogService.class);

	    public void log(){
	        LOG.info("{\r\n"
	        		+ "	\"id\":13456,\r\n"
	        		+ "	\"code\":\""+generateUUID()+"\",\r\n"
	        		+ "	\"message\":\"success\"\r\n"
	        		+ "}");
	        
	        
	        LOG.info("{\r\n"
	        		+ "	\"total\":"+generateRandomInt()+"\"\r\n"
	        		+ "}");
	    }
	    
	    public void generateLogSequence() {
	    	for (int i=0; i<4; i++) {
				log();			
				
			}
	    }
	    
	    private String generateUUID(){
	    	return UUID.randomUUID().toString().replace("-", "");
	    }
	    
	    private double generateRandomInt() {
	    	Random random = new Random();
	    	return random.nextDouble();
	    }
}
