package com.lw.file.utils;

import java.util.HashMap;
import java.util.Map;

public class AccountUtil {

	public static Map<String,String> accountMap  = new HashMap<>()   ;
	static{
		accountMap.put("test1", "test1");
		accountMap.put("test2", "test2") ;
		accountMap.put("test3", "test3") ;
	}
	
	public static Map<String,String> getAccountMap(){
		return accountMap ;
	}
}
