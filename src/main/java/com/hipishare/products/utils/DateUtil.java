package com.hipishare.products.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	/** 年月日时分秒毫秒(无下划线) yyyyMMddHHmmssSSS */
	public static final String DTLONGS = "yyyyMMddHHmmssSSS";

	/** 年月日时分秒(无下划线) yyyyMMddHHmmss */
	public static final String DTLONG = "yyyyMMddHHmmss";

	/** 完整时间 yyyy-MM-dd HH:mm:ss */
	public static final String SIMPLE = "yyyy-MM-dd HH:mm:ss";

	/** 年月日 yyyy-MM-dd */
	public static final String DTSHORTS = "yyyy-MM-dd";

	/** 年月日(无下划线) yyyyMMdd */
	public static final String DTSHORT = "yyyyMMdd";

	/** 时分秒(无下划线) HHmmss */
	public static final String DTTIME = "HHmmss";

	public static String getDate() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMdd");
		return dt.format(new Date());
	}

	public static String getNow() {
		SimpleDateFormat dt = new SimpleDateFormat("yyyyMMddHHmmss");
		return dt.format(new Date());
	}

	/**
	 * 获当前日期
	 * 
	 * @param date
	 * @param dateFormat
	 * @return String
	 */
	public static String getCurrentDate(String dateFormat) {
		return new SimpleDateFormat(dateFormat).format(new Date());
	}

	/**
	 * 获取自定义格式化日期
	 * 
	 * @param date
	 * @param dateFormat
	 * @return String
	 */
	public static String getDateFormat(Date date, String dateFormat) {
		return new SimpleDateFormat(dateFormat).format(date);
	}

	/**
	 * 按日加减日期
	 */
	public static Date addDays(Date date, int num) {
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.add(Calendar.DAY_OF_MONTH, num);
		return c.getTime();
	}

	/**
	 * @功能描述：判断日期是否过期
	 * @param beforeDate
	 * @param afterDate
	 * @return
	 */
	public static boolean isDateBefore(Date beforeDate, Date afterDate) {
		return beforeDate.before(afterDate);
	}

	/**
	 * 获取当前日期前一天 格式：YYYYMMDD
	 */
	public static String getCurrentDateFront(String dateFormat) {
		String strDate = new SimpleDateFormat(dateFormat).format(addDays(
				new Date(), -1));
		strDate = strDate.substring(0, 4) + strDate.substring(4, 6)
				+ strDate.substring(6);
		return strDate;
	}

	/**
	 * @功能描述：判断是否是周末
	 * @param time
	 * @return
	 */
	public static boolean isWeekend(String time) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date = null;
		try {
			date = format.parse(time);
		} catch (Exception e) {
			return false;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int week = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (week == 6 || week == 0) {// 0代表周日，6代表周六
			return true;
		}
		return false;
	}

	/**
	 * @功能描述：判断当前日期是星期几
	 * @param time
	 * @return
	 * @throws Exception
	 */
	public static int dayForWeek(String time) throws Exception {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date = format.parse(time);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 * 
	 * @功能描述：判断当前日期是星期几
	 * @param dt
	 * @return
	 */
	public static String getWeekOfDate(Date dt) {
		String[] weekDays = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		Calendar cal = Calendar.getInstance();
		cal.setTime(dt);
		int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
		if (w < 0)
			w = 0;
		return weekDays[w];
	}

	public static void main(String[] args) throws Exception {
		System.out.println(dayForWeek("20151129"));
	}
}
