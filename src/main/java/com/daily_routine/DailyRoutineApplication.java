package com.daily_routine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DailyRoutineApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DailyRoutineApplication.class);


	public static void main(String[] args) {
		log.info("로그 ㅎㅇ");
		SpringApplication.run(DailyRoutineApplication.class, args);
	}

}
