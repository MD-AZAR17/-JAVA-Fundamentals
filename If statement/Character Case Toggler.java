package practice;
import java.util.Scanner;
public class program10 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character: ");
		char a=sc.next().charAt(0);
		int b=a;
		if(b<97)
			System.out.println((char)(a+32));
		else
			System.out.println((char)(a-32));

	}

}
