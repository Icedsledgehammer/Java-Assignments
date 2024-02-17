package humblebeginnings;
//import java.util.Scanner;
import java.io.*;

public class Fibonacci 
{
			public static void main(String args[])
			{
				//int number = Integer.parseInt(args[0]);
				
				/*System.out.println("Enter Number:");
				Scanner scan = new Scanner(System.in);
				int number = scan.nextInt();*/
				
				
				//BufferedReader
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				try 
				{
					String input = reader.readLine();
				    int number = Integer.parseInt(input);
					for(int i = 0; i < number; i++)
					{
						System.out.println(fibonacci(i) + " ");
					}
				}
				catch(IOException e)
				{
					System.out.println("Invalid input. Please enter a valid number");
				}
				
			}
			
			public static int fibonacci(int n)
			{
				if(n <= 1)
				{
					return n;
				}
				else
				{
					return fibonacci(n - 1) + fibonacci(n - 2);
				}
			}
}
//When you're going to run this program do, run configurations, then go to arguments of the program and then do your thing