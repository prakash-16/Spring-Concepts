package com.bridgelabz.springconcepts;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bridgelabz.springconcepts.component.DemoBean;
import com.bridgelabz.springconcepts.controller.HelloRestController;

@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Hello, welcome to Demo");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demobean = context.getBean(DemoBean.class);
		logger.info("Demo Bean = " + demobean.toString());
		logger.warn("" + context.getBean(HelloRestController.class));
	}

}
