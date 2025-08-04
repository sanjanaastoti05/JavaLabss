package Day1Prrms;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int n = s.nextInt();
		if(n > 0)
		{
			System.out.println("Positive");
		}
		else 
		{
			System.out.println("Negative");
		}
	}

}
