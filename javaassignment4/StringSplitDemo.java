package javaassignment4;

import java.util.StringTokenizer;

public class StringSplitDemo {

	public static void main(String[] args) {

		String sample = "New Sample ";
		
		StringTokenizer stringTokenizer = new StringTokenizer(sample);
		try {
		String firstWord = stringTokenizer.nextToken();
		String secondWord = stringTokenizer.nextToken();
		String thirdWord = stringTokenizer.nextToken();
		
		System.out.println("First Word is "+ firstWord);
		System.out.println("Second Word is "+ secondWord);
		System.out.println("Third Word is "+thirdWord);
		}
		catch(Exception e) {
			System.out.println("No Words Available to display "+e.getMessage());
		}
	}

}
