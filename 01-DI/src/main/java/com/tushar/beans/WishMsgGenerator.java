package com.tushar.beans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMsgGenerator {
	@Autowired
	private LocalDateTime dt;
	
	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator.WishMsgGenerator()");
	}
	
	public String getWishMsg(String user) {
		String wish =null;
		int hour = dt.getHour();
		if(hour < 12)
			wish ="Good Morning-"+user;
		else if(hour < 16)
			wish ="Good Afternoon-"+user;
		else if(hour < 18)
			wish ="Good evening-"+user;
		else
			wish ="Good night-"+user;
		
		return wish;
	} 

}
