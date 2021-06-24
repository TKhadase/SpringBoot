package com.tushar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.tushar.beans.Student;

@SpringBootApplication
@ImportResource("com/tushar/beans/applicationCtx.xml")
public class Application {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		Student st =ctx.getBean("student",Student.class);
		st.prepration("Job");
		((ConfigurableApplicationContext) ctx).close();
	}

}
