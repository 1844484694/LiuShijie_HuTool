package com.rj.bd.hutool;

import java.util.Date;

import cn.hutool.core.date.DateUtil;

/**
 * @desc hutool日期类的简单使用
 * @author ShiJie
 * @time 2021-02-19
 */
public class HuTool 
{
    public static void main( String[] args )
    {
    	String dateTime1="2001-02-01 22:53:45";
    	String dateTime2="2002-02-02";
    	String dateTime3="20:50:45";
    	String dateTime4="2004-02-04 20:50";
    	 
    	//将不同的格式转换为Date对象
    	Date date1=DateUtil.parse(dateTime1);  
    	System.out.println("date1:"+date1.toString());
    	Date date2=DateUtil.parse(dateTime2);
    	System.out.println("date2:"+date2.toString());
    	Date date3=DateUtil.parse(dateTime3);
    	System.out.println("date3:"+date3.toString());
    	Date date4=DateUtil.parse(dateTime4);
    	System.out.println("date4:"+date4.toString());
    	 
    	//使用DateUtil.parse(String,String):Date 转换为指定格式的Date对象
    	Date date5=DateUtil.parse(dateTime1, "yyyy-MM-dd");
    	System.out.println("date5:"+date5.toString());
    	
    	//1.使用DateUtil.formatDateTime(Date date):String 将返回“yyyy-MM-dd hh:mm:ss”格式字符串
    	//2.使用DateUtil.formatDate(Date date):String 将返回“yyyy-MM-dd“格式字符串
    	//3.使用DateUtil.formatTime(Date date):String将返回“hh:mm:ss“格式字符串
    	//4.使用DateUtil.format(Date,String):String 将返回指定格式的字符串
    }
}
