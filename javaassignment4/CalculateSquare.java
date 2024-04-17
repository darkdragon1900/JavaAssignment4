package javaassignment4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateSquare {
	
	public static int calSquare(int num)
	{
		return num*num;
	}

	public static void main(String[] args) {
		

		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Square of given num is "+calSquare(num));
		}
		catch(InputMismatchException e)
		{
			System.out.println("Wrong input given by user");
			System.out.println(e.getMessage());
		}
	}

}
