package practive2;

import java.util.Scanner;

public class practice {
	public static void prime(int input)
	{
		int count = 0;
		for(int i = 2; i <= (input/2) ; i++)
		{
			if(input%i==0)
			{
				count++;
			}
		}
		if(count==0)
		{
			System.out.println(input +"- Prime number");
		}
		else
		{
			System.out.println(input +"- Not a prime number");
		}
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		prime(input);
		//number that is div by it self only and 1
		
	}

}
