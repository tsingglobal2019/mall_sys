package com.common.utils;

import java.io.PrintWriter;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.alibaba.fastjson.JSONObject;

public class CommonUtil {
	
	public static HttpServletRequest getRequest() {
		
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
	}
	
	public static HttpServletResponse getResponse() {
		
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
	}

	public static boolean isEmpty(final String value) {

		return StringUtils.isEmpty(value);
	}

	public static boolean isEmpty(final Object value) {

		return (null == value);
	}
	
	public static boolean validateEmail( final String email) {
		
		return email.matches( "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$" );
	}
	
	public static String dateToStr( final Date date) {
		
		return dateToStr( date, "yyyy-MM-dd HH:mm:ss" );
	}
	
	public static String dateToStr( final Date date, final String pattern) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 
	 * @Title: genarateID 生成ID
	 * @Description: TODO(基于Twitter的Snowflake算法，生成符合时间趋势的ID.)
	 * @return long 返回长整型ID
	 */
	public static long genarateID() {


		SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0,0);

		return idWorker.nextId();
	}

	public static String MD5(String s) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(s.getBytes("utf-8"));
			return toHex(bytes);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static String MD5( final String s, final boolean encryptOK) {
		if( encryptOK ) {
			
			return MD5(s);
		}
		
		return s;
	}

	private static String toHex(byte[] bytes) {

		final char[] HEX_DIGITS = "0123456789ABCDEF".toCharArray();
		StringBuilder ret = new StringBuilder(bytes.length * 2);
		for (int i = 0; i < bytes.length; i++) {
			ret.append(HEX_DIGITS[(bytes[i] >> 4) & 0x0f]);
			ret.append(HEX_DIGITS[bytes[i] & 0x0f]);
		}
		return ret.toString();
	}

	public static void sendJsonData( final HttpServletResponse response, final String data) throws Exception {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(data);
		out.flush();
		out.close();
	}
	
	
	public static void sendJsonData( final String data) throws Exception {
		
		sendJsonData( CommonUtil.getResponse(), data);
	}
	
	public static void success( final HttpServletResponse response, final String data) throws Exception {
		
		success( response, data, "操作完成！");
	}
	
	public static void success( final String data) throws Exception {
		
		success( CommonUtil.getResponse(), data);
	}
	
	public static void success( final HttpServletResponse response, final String data, final String successMsg) throws Exception {
		JSONObject errorInfo = new JSONObject();
		errorInfo.put("status", true);
		errorInfo.put("code", 200);
		errorInfo.put("message", successMsg);
		errorInfo.put("data", data);
		sendJsonData( response, errorInfo.toJSONString());
	}
	
	public static void error(HttpServletResponse response, String errorMsg) throws Exception {
		JSONObject errorInfo = new JSONObject();
		errorInfo.put("status", false);
		errorInfo.put("code", 404);
		errorInfo.put("message", errorMsg);
		errorInfo.put("data", null);
		sendJsonData( response, errorInfo.toJSONString());
	}
}

