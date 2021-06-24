package com.tushar;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.tushar.commonObjects.covidVO;
import com.tushar.controller.MainController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Hospitals count::");
		int count=sc.nextInt();
		String Hospitals[]=null;
		if(count>=1)
			Hospitals=new String[count];
		else {
			System.out.println("------------invalid Hospitals count------------");
			return;
		}
		for(int i=0;i<count;++i) {
			System.out.println("enter Hospitals"+(i+1));
			String Hospital=sc.next();
			Hospitals[i]=Hospital;
		}
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		MainController controller =ctx.getBean("covidController",MainController.class);
		try {
			List<covidVO> iocVO = controller.getCovidPatientsByHospital(Hospitals);
			iocVO.forEach(vo->{
				System.out.println(vo);
			});
		
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error in Application.");
		}
		((ConfigurableApplicationContext) ctx).close();
	}

}
