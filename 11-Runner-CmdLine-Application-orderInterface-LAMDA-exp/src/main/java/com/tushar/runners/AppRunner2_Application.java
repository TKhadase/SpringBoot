package com.tushar.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppRunner2_Application implements ApplicationRunner, Ordered  {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("--------------AppRunner2_Application.run()--------------");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 3;
	}

}
