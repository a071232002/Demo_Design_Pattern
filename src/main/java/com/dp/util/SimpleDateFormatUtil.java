package com.dp.util;

import java.text.SimpleDateFormat;

public class SimpleDateFormatUtil {
	
	public static long ONEDAY = 86400000L;
	
	public static final SimpleDateFormat DATE = new SimpleDateFormat("yyyyMMdd");
	public static final SimpleDateFormat HOUR = new SimpleDateFormat("yyyyMMddHH");
	public static final SimpleDateFormat MINUTE = new SimpleDateFormat("yyyyMMddHHmm");
	public static final SimpleDateFormat SECOND = new SimpleDateFormat("yyyyMMddHHmmss");
	public static final SimpleDateFormat DEC1 = new SimpleDateFormat("yyyyMMddHHmmssS");
	public static final SimpleDateFormat DEC2 = new SimpleDateFormat("yyyyMMddHHmmssSS");
	public static final SimpleDateFormat DEC3 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
	public static final SimpleDateFormat DEC4 = new SimpleDateFormat("yyyyMMddHHmmssSSSS");
	
	public static final SimpleDateFormat DATE_SLASH = new SimpleDateFormat("yyyy/MM/dd");
	public static final SimpleDateFormat HOUR_SLASH = new SimpleDateFormat("yyyy/MM/dd HH");
	public static final SimpleDateFormat MINUTE_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm");
	public static final SimpleDateFormat SECOND_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	public static final SimpleDateFormat DEC1_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.S");
	public static final SimpleDateFormat DEC2_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SS");
	public static final SimpleDateFormat DEC3_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
	public static final SimpleDateFormat DEC4_SLASH = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSSS");

	public static final SimpleDateFormat DATE_DASH = new SimpleDateFormat("yyyy-MM-dd");	
	public static final SimpleDateFormat HOUR_DASH = new SimpleDateFormat("yyyy-MM-dd HH");
	public static final SimpleDateFormat MINUTE_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	public static final SimpleDateFormat SECOND_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final SimpleDateFormat DEC1_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");
	public static final SimpleDateFormat DEC2_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SS");
	public static final SimpleDateFormat DEC3_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	public static final SimpleDateFormat DEC4_DASH = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSS");

}
