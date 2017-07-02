/**
 * Project Name: project_framework_design_java
 * File Name: GoldbackGuess.java
 * Package Name: com.fanglei.example.goldbachguess
 * Date: Jun 30, 2017 10:17:03 PM
 * Copyright (c) 2017, fanglei@pku.edu.cn/864720655@qq.com. All Rights Reserved.
 * 
 */

package com.fanglei.example.goldbachguess;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName: GoldbackGuess
 * Description:
 * 哥德巴赫猜想是说任何一个大于2的偶数都能表示为两个素数之和。请编写一个Java程序，
 * 验证1～100内哥德巴赫猜想的正确性，也就是近似证明哥德巴赫猜想。
 * @author Lei Fang
 * @email fanglei@pku.edu.cn
 * @version
 * @date: Jun 30, 2017 10:17:03 PM
 */
public class GoldbackGuess
{
	/**
	 * The max number for proving Goldback Guess
	 */
	private Integer maxNumber = new Integer("0");

	/**
	 * Prime numbers set
	 */
	private Set<Integer> primeNumbers = new HashSet<Integer>();


	/**
	 * 
	 * Creates a new instance of GoldbackGuess.
	 *
	 */
	public GoldbackGuess() {}

	/**
	 * 
	 * Constructor
	 * 
	 * @param maxNumber the max number
	 */
	public GoldbackGuess(int maxNumber)
	{
		// Set the maxNumber >= 4
		maxNumber = Math.max(maxNumber, 4);
		this.maxNumber = maxNumber;
		this.primeNumbers = generatePrimeNumbers(maxNumber);
	}

	/**
	 * checkGoldbackGuess
	 * 
	 * check the Goldback Guess for number up to maxNumber
	 * @param maxNumber
	 * @return the result
	 */
	public boolean checkGoldbackGuess()
	{
		for (int i = 4; i <= maxNumber; i += 2)
		{
			if (!checkOneEven(i))
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * checkOneEven
	 * 
	 * check whether one even is the sume of two primes
	 * 
	 * @param even the even number
	 * @return the result
	 */
	private boolean checkOneEven(int even)
	{
		int j;
		for (int i = 1; i <= (even/2); i ++)
		{
			j = even - i;
			if (primeNumbers.contains(i) && primeNumbers.contains(j))
			{
				System.out.println(even + " = " + i + " + " + j + ",");
				return true;
			}
		}
		return false;
	}

	/**
	 * generatePrimeNumbers
	 * 
	 * Generate all the primes up to maxNumber
	 * 
	 * @param maxNumber the max number
	 * @return the primes set
	 */
	public Set<Integer> generatePrimeNumbers(int maxNumber)
	{
		Set<Integer> primeNumbers = new HashSet<>();
		for (int i = 2; i < maxNumber; i ++)
		{
			if (isPrime(i))
			{
				primeNumbers.add(i);
			}
		}
		return primeNumbers;
	}

	/**
	 * isPrime
	 * 
	 * Check whether one number is a prime
	 * 
	 * @param number the number
	 * @return the result
	 */
	private boolean isPrime(int number)
	{
		if (number == 1)
		{
			return false;
		}
		for (int i = 2; i < (number - 1); i++)
		{
			if ((number % i) == 0)
			{
				return false;
			}
		}
		return true;
	}

	/**
	 * maxNumber.
	 * 
	 * @return  the maxNumber
	 */
	public Integer getMaxNumber()
	{
		return maxNumber;
	}

	/**
	 * maxNumber.
	 * 
	 * @param maxNumber the maxNumber to set
	 */
	public void setMaxNumber(Integer maxNumber)
	{
		this.maxNumber = maxNumber;
	}

	/**
	 * primeNumbers.
	 * 
	 * @return  the primeNumbers
	 */
	public Set<Integer> getPrimeNumbers()
	{
		return primeNumbers;
	}

	/**
	 * primeNumbers.
	 * 
	 * @param primeNumbers the primeNumbers to set
	 */
	public void setPrimeNumbers(Set<Integer> primeNumbers)
	{
		this.primeNumbers = primeNumbers;
	}
}
