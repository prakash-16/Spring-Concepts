package com.bridgelabz.springconcepts;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bridgelabz.springconcepts.component.DemoBean;
import com.bridgelabz.springconcepts.component.EmployeeBean;
import com.bridgelabz.springconcepts.controller.HelloRestController;

@SpringBootApplication
public class SpringConceptsApplication {

	public static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Hello, welcome to Demo");
		ConfigurableApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		DemoBean demobean = context.getBean(DemoBean.class);
		logger.debug("Demo Bean = " + demobean.toString());
		logger.debug("" + context.getBean(HelloRestController.class));
		
		EmployeeBean empBean = context.getBean(EmployeeBean.class);
		empBean.setEid(52);
		empBean.setName("ABCDEF");
		empBean.showEmployeeDetails();
	}

}
