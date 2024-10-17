package com.dp.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dp.util.DateTimeFormatterUtil.FormatterPattern;

public class TestDateUtil {
	
	public static void main(String[] args) {
		Date date = new Date();
		java.sql.Date sqlDate = java.sql.Date.valueOf(LocalDate.now());;
		
		LocalDate localDate = LocalDate.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		List<String> str = new ArrayList<String>(); 
		
		str.add(SimpleDateFormatUtil.SECOND_DASH.format(date));
		str.add(DateTimeFormatterUtil.format(date, FormatterPattern.DECIMAL_3_DASH));
		str.add(DateTimeFormatterUtil.format(sqlDate, FormatterPattern.SECOND_SLASH));
		str.add(DateTimeFormatterUtil.format(localDate, FormatterPattern.MINUTE));
		str.add(DateTimeFormatterUtil.format(localDateTime, FormatterPattern.HOUR_DASH));		
		
		for (String s : str) {
			System.out.println(s);
		}
	}
}
