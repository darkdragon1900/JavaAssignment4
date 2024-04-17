package javaassignment4;

import java.util.Scanner;

public class PalaindreomeChecker {

	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a String to check palindrome or not");
		        String input = sc.next();
		        
		        boolean res = isPalindrome(input);
		        if(res==true)
		        {
		        	System.out.println("The given string is palindrome");
		        }
		        else
		        	System.out.println("The String is not palindrome");
		        
		    }

		    public static boolean isPalindrome(String str) {
		       
		        String processedString = str.replaceAll("\\s+", "").toLowerCase();
		       
		       
		        return processedString.equals(new StringBuilder(processedString).reverse().toString());
		    }
		
	

}
