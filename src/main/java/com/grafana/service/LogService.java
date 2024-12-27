package com.grafana.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LogService {

	 private final Logger LOG = (Logger) LoggerFactory.getLogger(LogService.class);

	    public void log(){
	        LOG.info("LogService is logging");
	    }
}
