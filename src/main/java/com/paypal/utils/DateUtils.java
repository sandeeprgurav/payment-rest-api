package com.paypal.utils;

import java.time.LocalDate;

public class DateUtils {
  
	public static LocalDate getStringToDate(String date) throws Exception {				
	    return LocalDate.parse(date);
	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getStringToDate("2020-07-22"));		
	}
}
