package com.tushar;

import java.io.PrintStream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.businessObjects.userDetails;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("main() started");
		ApplicationContext ctx =  SpringApplication.run(Application.class, args);
		userDetails user = ctx.getBean("userBO", userDetails.class);
		System.out.println("user details: "+user);
		//user details: userDetails(id=3, name=Tushar, nickNames=[tushar, chintu], friends=[Shiv, Rani, Om], phone=[444555, 789456, 741852], idDetails={aadhar=5555555, pan=QWERT4321, voterid=ABCD1234}, companyDetails=Company(name=Ebix, loc=Pune, desg=Analyst))

		((ConfigurableApplicationContext) ctx).close();
		System.out.println("main() ends");
	}

}
