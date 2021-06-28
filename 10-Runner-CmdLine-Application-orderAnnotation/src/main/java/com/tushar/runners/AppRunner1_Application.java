package com.tushar.runners;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)
@Component
public class AppRunner1_Application implements ApplicationRunner {
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("------------- AppRunner1_Application.run() start---------------");
		System.out.println("NonOption args:"+args.getNonOptionArgs());  //only value ::: NonOption args:[TusharArg]
		System.out.println("option arg names/keys:"+args.getOptionNames());  // only keys::: option arg names/keys:[lName, fName]
		System.out.println("Source args"+Arrays.toString(args.getSourceArgs()));//::: Source args[TusharArg, --fName=tushar, --lName=khadse]
		System.out.println("--------------AppRunner1_Application.run() End--------------");
				
	}

}
