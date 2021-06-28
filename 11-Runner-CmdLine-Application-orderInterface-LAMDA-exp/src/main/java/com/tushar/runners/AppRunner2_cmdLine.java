package com.tushar.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class AppRunner2_cmdLine implements CommandLineRunner , Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("--------------AppRunner2_cmdLine.run()--------------");
	}

	@Override
	public int getOrder() {
		return 4;
	}

}
