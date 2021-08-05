
package com.yash;
import java.util.Scanner;

public class NumberCheck {

	
	public static void main(String[] args)
	{
		//int number=58;
		//checkNumberType(number);
		System.out.println("Please enter the number");
		Scanner scanner=new Scanner(System.in);
		isEven(scanner.nextInt());
		scanner.close();

	}

	public static boolean isEven(int number) {
		boolean result;
		if(number%2==0)
		{
			System.out.println("Given number is Even!!!!");
			result=true;
		}
		else
		{
			System.out.println("Given number is odd!!!!");
			result=false;
		}
		return result;
	}

}
