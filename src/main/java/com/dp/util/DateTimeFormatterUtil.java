package com.dp.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeFormatterUtil {
	
	private static final ZoneId SYSTEM_ZONE_ID = ZoneId.systemDefault();
		
	private static LocalDateTime toLocalDateTime (Date date) {
		return date.toInstant().atZone(SYSTEM_ZONE_ID).toLocalDateTime();
	}
		
	public static String format(Date date, FormatterPattern pattern) {
		return toLocalDateTime(date).format(pattern.getFormatter());
	}
	
	public static String format(java.sql.Date sqlDate, FormatterPattern pattern) {
		return sqlDate.toLocalDate().atStartOfDay().format(pattern.getFormatter());
	}
	
	public static String format(LocalDate localDate, FormatterPattern pattern) {
		return localDate.atStartOfDay().format(pattern.getFormatter());
	}
	
	public static String format(LocalDateTime localDateTime, FormatterPattern pattern) {
		return localDateTime.format(pattern.getFormatter());
	}
	
	public enum FormatterPattern {
		
	    DATE(DateTimeFormatter.ofPattern("yyyyMMdd")),
	    HOUR(DateTimeFormatter.ofPattern("yyyyMMddHH")),
	    MINUTE(DateTimeFormatter.ofPattern("yyyyMMddHHmm")),
	    SECOND(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")),
	    DECIMAL_1(DateTimeFormatter.ofPattern("yyyyMMddHHmmssS")),
	    DECIMAL_2(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSS")),
	    DECIMAL_3(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")),

	    DATE_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd")),
	    HOUR_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH")),
	    MINUTE_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm")),
	    SECOND_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")),
	    DECIMAL_1_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.S")),
	    DECIMAL_2_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SS")),
	    DECIMAL_3_SLASH(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS")),

	    DATE_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd")),
	    HOUR_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH")),
	    MINUTE_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")),
	    SECOND_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")),
	    DECIMAL_1_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.S")),
	    DECIMAL_2_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SS")),
	    DECIMAL_3_DASH(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));

        private final DateTimeFormatter formatter;

        FormatterPattern(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public DateTimeFormatter getFormatter() {
            return formatter;
        }
    }
}
