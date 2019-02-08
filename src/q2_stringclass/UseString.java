package q2_stringclass;

public class UseString {

	public static void main(String[] args) {
		
		//String s = new String ("I Love Coding");
		String s = "I Love Coding";
		
		//1: Converts the String to Lower case.
		System.out.println("Lower Case: " + s.toLowerCase());

		//2: Converts the String to Upper case.
		System.out.println("Upper Case: " + s.toUpperCase());

		//3: Returns the size of a String.
		System.out.println("The length of the String is: " + s.length());

		//4: Returns a character based on the index.
		System.out.println("The character at the position 7 is: " + s.charAt(7));
		
		//5: Returns the index number of a character.
		System.out.println("The index number of character 'L' is: " + s.indexOf('L'));
		
		//6: Returns the starting index number of a string word.
		System.out.println("The index number of word 'Coding' is: " + s.indexOf("Coding"));
		
		//7: Returns the substring from the index specified to the end of the String.
		System.out.println("Substring from index 2 is: " + s.substring(2));

		//8: Returns the substring from the index range you specified.
		System.out.println("Substring from 4 to 9 is: " + s.substring(4, 9));
		
		//9: Concatenates 2 Strings.
		String s1 = "Learn";
		String s2 = "Java";
		System.out.println("After concatination: " + s1.concat(s2));

		//10: Compare 2 Strings.
		String s3 = "selenium";
		String s4 = "Selenium";
		System.out.println(s3 + " is same as " + s4 + " : " + s3.equals(s4));
		
		//11: Compare 2 Strings - ignore the upper & lower case.
		System.out.println(s3 + " is same as " + s4 + " ignoring case considerations: " + s3.equalsIgnoreCase(s4));
		
		//12: If a character present then it will return true else it will return false
        System.out.println("'" + s + "'" + " contains character 'd': " +s.contains("d"));
        System.out.println("'" + s + "'" + " contains character 'm': "+ s.contains("m"));
		
		//13: Trimming the word - it will remove the starting and ending spaces.
		String s5 = "   Learn Selenium and UFT   ";
		System.out.println("String length before trimming: " + s5.length());
		System.out.println("Trim the word: " + s5.trim());
		String trimLen = s5.trim();
		System.out.println("String length after trimming: " + trimLen.length());

		//14: Replacing characters.
		String date = "01-01-2018"; //01/01/2018
		System.out.println("Date before replacing: " + date);
		System.out.println("Date after replacing: " + date.replace('-', '/'));
		
		//15: Split 
		String s6 = "Hello_Selenium_Testing";
		System.out.println("String before spliting: " + s6);
		String arr[] = s6.split("_");
		System.out.println("String after spliting: ");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		//16: This method is used to check the string is empty or not. Return true or false.
         String s7="VB Script";
         String s8 ="";
         System.out.println("'" + s7 + "' is empty: " + s7.isEmpty());
         System.out.println("'" + s8 + "' is empty: " + s8.isEmpty());
         
         //17:String startsWith() and endsWith() method
         String s9 ="Virginia";  
         System.out.println("'" + s9 + "' starts with 'Mi': " +s9.startsWith("Mi"));
         System.out.println("'" + s9 + "' ends with 'Mi': "+ s9.endsWith("ia"));
         
         //18: String intern() method
         String b = new String("Girl");  
         String y = b.intern();  
         System.out.println("String intern() method: " + y); 
         
        //19: string valueOf() method converts given type such as int, long, float, double, boolean, char and char array into string
         int i = 10;  
         String j = String.valueOf(i);  
         System.out.println("String valueOf() method: " + j+10); 
         
         //20: char[ ] toCharArray( ) method
         String k = "Java";
         char [] arrayChar = k.toCharArray();  //this will produce array of size 4
         System.out.println(arrayChar.length);

	}

}
