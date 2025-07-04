package practice;
import java.util.Scanner;
public class program6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first char: ");
		char one=sc.next().charAt(0);
		System.out.println("Enter the second char: ");
		char two=sc.next().charAt(0);
		if(one>two)
		{
			System.out.println(two +","+ one);
		}
		else
		{
			System.out.println(one +","+ two);
		}
	}
}
