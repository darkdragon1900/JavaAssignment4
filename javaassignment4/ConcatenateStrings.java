package javaassignment4;

public class ConcatenateStrings {
	
	public static String concatenate(String a[])
	{
		StringBuilder stringBuilder = new StringBuilder();
		for(String str : a)
		{
			stringBuilder.append(str);
		}
		return stringBuilder.toString();
	}

	public static void main(String[] args) {
		
		String sample[] = {"Shivam ", " " ,"Nanagir" , " Gosavi "," Hii ", "!!!"};
		
		System.out.println("The Concatenated String is "+concatenate(sample));

	}

}
