package com.tushar;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.tushar.beans.WishMsgGenerator;

@SpringBootApplication
public class Application {
	
	@Bean
	public LocalDateTime getLocalDateTime() {
		LocalDateTime dt = LocalDateTime.now();
		return dt;
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
		WishMsgGenerator wishMsg = ctx.getBean("wmg",WishMsgGenerator.class);
		String msg = wishMsg.getWishMsg("Priya");
		System.out.println(msg);
		((ConfigurableApplicationContext) ctx).close();
	}

}
