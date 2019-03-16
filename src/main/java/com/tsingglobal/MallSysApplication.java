package com.tsingglobal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MallSysApplication {

	public static void main(String[] args) {
		cac = SpringApplication.run(MallSysApplication.class, args);
	}
	
	public static ConfigurableApplicationContext cac;
}
