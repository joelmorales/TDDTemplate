package com.swacorp.mx.entrypoints.rest;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SubEndPoint {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(SubEndPoint.class);
	public static final String API_PATH = "/start";
	
	
	
	public SubEndPoint() {		
		
	}

	@RequestMapping(value = API_PATH, method = RequestMethod.GET)	
	public @ResponseBody String startColdStart() {
		LOGGER.info("Starting Coldstart Capabilities " );
		try {			
			return "TEST";
		} catch (Exception ex) {
			LOGGER.info("Failed: " + ex.getMessage());
			throw new NotStartingException(ex.getMessage());
		}
	}

	
	
}
