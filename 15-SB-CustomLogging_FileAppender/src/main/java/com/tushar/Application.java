package com.tushar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.beans.Student;

@SpringBootApplication
public class Application {
	
	
	public static void main(String[] args) {
		Logger log = LoggerFactory.getLogger(Application.class); 
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Student st =ctx.getBean("student",Student.class);
		log.trace("Application.main() start");
		st.prepration("Job");
		((ConfigurableApplicationContext) ctx).close();
		log.trace("Application.main() END");
	}

}
