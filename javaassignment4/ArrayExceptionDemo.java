package javaassignment4;

import java.util.Scanner;

public class ArrayExceptionDemo {

	public static void main(String[] args) {
	
		try {
		int size = 5;
		int arr[] = new int[size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("The position of element you want to print (Start from 0");
		int position = sc.nextInt();
		System.out.println("The element at "+position+ " is "+arr[position]);
		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Cannot print array element at this position");
		}
	}

}
