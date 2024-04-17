package javaassignment4;

import java.util.Scanner;

public class IllegalArgumentDemo {

		public static void covertInt(String s)
		{
			int num=Integer.parseInt(s);
			if(num<Integer.MIN_VALUE || num>Integer.MAX_VALUE)
			{
				throw new IllegalArgumentException();
			}
		}

		public static void main(String[] args) {

			System.out.println(Integer.MAX_VALUE);
			System.out.println(Integer.MIN_VALUE);
			System.out.println("Enter a number");
			Scanner sc = new Scanner(System.in);
			String num = sc.next();
			try {
			covertInt(num);
			System.out.println("Number Converted to String Successfully");
			}
			catch(NumberFormatException e1)
			{
				System.out.println("Enter num inbetween given range");
			}
			
			catch(IllegalArgumentException e)
			{
				System.out.println("Wrong input given exception");
			}

		

	}

}
