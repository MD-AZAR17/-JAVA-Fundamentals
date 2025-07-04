package practice;
import java.util.Scanner;
public class program7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first char: ");
		char in=sc.next().charAt(0);
		if((in>='A' && in<='z')|| (in>='a' && in<='z'))
		{
			System.out.println("Alphabhet");
		}
		else if(in >= 0 && in < 0)
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
	}
}
