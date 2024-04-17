package javaassignment4;

import java.util.Scanner;

public class Calculator {
	int num1;
	int num2;
	
	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add()
	{
		if(num1<0 || num2<0)
		{
			throw new ArithmeticException("Num can not be negative");
		}
		
		return num1+num2;
	}
	
	public int sub()
	{
		if(num1<0 || num2<0)
		{
			throw new ArithmeticException("Num can not be negative");
		}
		
		return num1-num2;
	}
	public int mul()
	{
		if(num1==0 || num2==0)
		{
			throw new ArithmeticException("Both num can not be Zero ");
		}
		return num1*num2;
	}
	public double div()
	{
		if(num2==0)
		{
			throw new ArithmeticException("Num 2 can not be zero");
		}
		
		return(double)num1/num2;
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter two Numbers");
			
		int n1=sc.nextInt();
		int n2 = sc.nextInt();
		Calculator c1 = new Calculator(n1, n2);
		System.out.println("Addition : "+c1.add());
		System.out.println("Subtraction : "+c1.sub());
		System.out.println("Multiplication : "+c1.mul());
		System.out.println("Divison : "+c1.div());
		c1.sub();
		c1.mul();
		c1.div();

		}
		catch(ArithmeticException e)
		{
			System.out.println("Please provide valid inputs");
		}
		catch(NumberFormatException e1)
		{
			System.out.println(e1);
		}
	}

}
