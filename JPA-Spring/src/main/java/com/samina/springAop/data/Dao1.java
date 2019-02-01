package com.samina.springAop.data;
import org.springframework.stereotype.Repository;

import com.samina.springAop.Aspect.TrackTime;

@Repository
public class Dao1 {
	
	@TrackTime
	public String retrieveSomething(){
		return "Dao1";
	}

}