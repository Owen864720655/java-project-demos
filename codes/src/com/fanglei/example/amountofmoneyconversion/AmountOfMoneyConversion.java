/**
 * Project Name: project_framework_design_java
 * File Name: AmountOfMoneyConversion.java
 * Package Name: com.fanglei.example.amountofmoneyconversion
 * Date: Jul 2, 2017 12:43:33 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.amountofmoneyconversion;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * ClassName: AmountOfMoneyConversion
 * Description:
 * 	Conver the amount of money from the Arabic digits to traditional Chinese letters
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jul 2, 2017 12:43:33 PM
 */
public class AmountOfMoneyConversion
{
	// Static Strings
	private static final String ZERO = "零";
	private static final String ONE = "壹";
	private static final String TWO = "贰";
	private static final String THREE = "叁";
	private static final String FOUR = "肆";
	private static final String FIVE = "伍";
	private static final String SIX = "陆";
	private static final String SEVEN = "柒";
	private static final String EIGHT = "捌";
	private static final String NINE = "玖";
	private static final String TEN = "拾";
	private static final String HUNDRED = "佰";
	private static final String THOUSAND = "仟";
	private static final String TEN_THOUSAND = "万";
	private static final String HUNDRED_THOUSAND = "拾";
	private static final String MILLION = "佰";
	private static final String TEN_MILLION = "仟";
	private static final String HUNDRED_MILLION = "亿";
	private static final String YUAN = "元整";

	/**
	 * Digits 0~9
	 */
	private static Map<String, String> digits = new HashMap<String, String>();

	/**
	 * Units
	 */
	private static Map<Integer, String> units = new HashMap<>();

	/**
	 * init
	 * 
	 * Initialize the digits and units maps
	 */
	public static void init()
	{
		digits.put("0", ZERO);
		digits.put("1", ONE);
		digits.put("2", TWO);
		digits.put("3", THREE);
		digits.put("4", FOUR);
		digits.put("5", FIVE);
		digits.put("6", SIX);
		digits.put("7", SEVEN);
		digits.put("8", EIGHT);
		digits.put("9", NINE);

		units.put(2, TEN);
		units.put(3, HUNDRED);
		units.put(4, THOUSAND);
		units.put(5, TEN_THOUSAND);
		units.put(6, HUNDRED_THOUSAND);
		units.put(7, MILLION);
		units.put(8, TEN_MILLION);
		units.put(9, HUNDRED_MILLION);
	}

	/**
	 * Constructor
	 * 
	 */
	public AmountOfMoneyConversion()
	{
		init();
	}


	/**
	 * parseNumber
	 * 
	 * parse the digits from the String
	 * @param number the number String
	 * @return the digits
	 */
	private static String parseNumber(String number)
	{
		Pattern pattern = Pattern.compile("￥(\\d+)");
		Matcher matcher = pattern.matcher(number);
		if (matcher.find())
		{
			return matcher.group(1);
		}
		return null;
	}

	/**
	 * convert
	 * 
	 * Convert the amount of money from Arabic Numbers to Chinese traditional Format
	 * @param number the arabic description
	 * @return Chinese traditional description
	 */
	public static String convert(String number)
	{
		// Parse the numbers
		String numberStr = parseNumber(number);
		if (numberStr == null)
		{
			return null;
		}

		// Split the numbers to groups
		int numberLen = numberStr.length();
		int len = numberLen/8;
		int tailLen = numberLen % 8;
		String result = "";

		// Deal with the consecutive 8 digits
		for (int i = len; i > 0; i --)
		{
			int endIndex = tailLen + (i * 8);
			int beginIndex = endIndex - 8;
			String tempStr = processOneGroup(numberStr.substring(beginIndex, endIndex));
			if (i < len)
			{
				tempStr += HUNDRED_MILLION;
			}
			result = tempStr + result;
		}

		// Deal with the tail
		if (len > 0)
		{
			result = processOneGroup(numberStr.substring(0, tailLen)) + HUNDRED_MILLION + result;
		}else {
			result = processOneGroup(numberStr.substring(0, tailLen)) + result;
		}

		// Remove the unnecessary Zeros
		StringBuffer stringBuffer = new StringBuffer();
		int index = 0;
		while((index < result.length()) && (result.substring(index, index+1).equals(ZERO)))
		{
			index ++;
		}
		stringBuffer.append(result.charAt(index));
		while ((++index) < result.length())
		{
			if(!stringBuffer.substring(stringBuffer.length()-1).equals(ZERO) && ! result.substring(index, index+1).equals(ZERO))
			{
				stringBuffer.append(result.charAt(index));
			}
		}
		stringBuffer.append(YUAN);

		return stringBuffer.toString();
	}


	/**
	 * processOneGroup
	 * 
	 * Generate the traditional Chinese description for one group (less than 8 digits)
	 * @param number
	 * @return
	 */
	private static String processOneGroup(String number)
	{
		StringBuffer stringBuffer = new StringBuffer();
		int len = number.length();
		for (int i = len; i > 0; i --)
		{
			String num = number.substring(len-i, (len-i) + 1);
			stringBuffer.append(digits.get(num));
			if (!num.equals("0"))
			{
				String unit = units.get(i);
				stringBuffer.append(unit==null? "":unit);
			}
		}
		return stringBuffer.toString();
	}
}
