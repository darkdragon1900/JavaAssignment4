package javaassignment4;

public class RemoveDuplicates {
	
	public static String removeDuplicates(String s)
	{
		StringBuffer stringBuffer = new StringBuffer();
		for(int i=0;i<s.length();i++)
		{
			char current = s.charAt(i);
			if(stringBuffer.indexOf(String.valueOf(current))==-1)
			{
				stringBuffer.append(current);
			}
		}
		return stringBuffer.toString();
		
	}


	public static void main(String[] args) {
		
		String sample = "This is my Sample String";
		
		System.out.println("Original String : "+sample);
		System.out.println("String After Removing Duplicates : "+removeDuplicates(sample));
		
		

	}

}
