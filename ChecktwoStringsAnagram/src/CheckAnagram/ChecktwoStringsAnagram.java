package CheckAnagram;

import java.util.Scanner;
import java.util.Arrays;

public class ChecktwoStringsAnagram {
	
	public static boolean isAnagram(String str1, String str2)
	{
			if(str1.length() != str2.length())
				return false;
		
			else
			{
				char [] str1Array = str1.toCharArray();
				char [] str2Array = str2.toCharArray();
		
				Arrays.sort(str1Array);
				Arrays.sort(str2Array);
				
				return Arrays.equals(str1Array, str2Array);
			} 
			
	}
	
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter string 1 : ");
			String str1 = sc.nextLine();
			
			System.out.println("Please enter string 2 : ");
			String str2 = sc.nextLine();
			
			str1 = str1.replaceAll("\\s", "").toLowerCase();
			str2 = str2.replaceAll("\\s", "").toLowerCase();
			
			if (isAnagram(str1, str2))
			System.out.println("String : " + str1 +" and " + str2 +" are Anagram");	
			
			else
				
			System.out.println("String : " + str1 +" and " + str2 +" are Not Anagram");
		}
		}

}