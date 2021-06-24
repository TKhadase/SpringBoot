package com.tushar;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.tushar.commonObjects.covidVO;
import com.tushar.controller.MainController;

@SpringBootApplication
public class Application {
	
	@Autowired
	private Environment env;
	
	@Bean
	@Profile("uat")
	public ComboPooledDataSource getC3poDS() throws Exception {
		System.out.println("Application.getC3poDS()");
		ComboPooledDataSource ds = new ComboPooledDataSource();
		ds.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		ds.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		ds.setUser(env.getRequiredProperty("spring.datasource.username"));
		ds.setPassword(env.getRequiredProperty("spring.datasource.password"));
		return ds;
	}

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
