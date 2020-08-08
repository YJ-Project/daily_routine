package com.daily_routine.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.daily_routine")
@EnableAutoConfiguration
public class DailyRoutineApplication {


	public static void main(String[] args) {
		SpringApplication.run(DailyRoutineApplication.class, args);
	}

}
