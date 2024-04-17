package javaassignment4;

import java.util.Scanner;

public class VowelsDemo {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String");
		String sample = sc.next();
		boolean value=false;
		
		for(int i=0;i<sample.length();i++)
		{
			if(sample.charAt(i)=='a' || sample.charAt(i)=='e' ||sample.charAt(i)=='i' ||sample.charAt(i)=='o' ||sample.charAt(i)=='u'  )
			{
				value=true;
			}
			
		}
		
		if(value==true)
		{
			System.out.println("Vowels are present");
		}
		else
			System.out.println("Vowels not present");
		

	}
}
