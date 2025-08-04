package Aug4;

import java.util.Scanner;

public class StringOperations9 {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the input string: ");
		String input = s.nextLine();
		System.out.println("Enter your choice");
		System.out.println("1.Add String to itself");
		System.out.println("2.Replace odd positions with '#'");
        System.out.println("3.Remove duplicate characters");
        System.out.println("4.Change odd characters to upper case");
        int choice = s.nextInt();
       
        String result = " ";
        
        switch(choice) {
        case 1:
        	result = input + input;
        	break;
        case 2:
        	for(int i=0;i<input.length();i++)
        	{
        		if(i%2 == 0) {
        			result += input.charAt(i);
        		}
        		else {
        			result += "#";
        		}
        	}
        	break;
        case 3:
        	for(int i=0;i<input.length();i++)
        	{
        		char ch = input.charAt(i);
        		if(result.indexOf(ch) == -1)
        		{
        			result +=ch;
        		}
        	}
        	break;
        case 4:
        	for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if (i % 2 == 0) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += ch;
                }
            }
            break;
       
        default:
        	System.out.println("Invalid Choice");
        	break;
        	
        }
        
	System.out.println("\n Result: " +result);
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	

}
