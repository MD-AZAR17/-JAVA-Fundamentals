package practice;
import java.util.Scanner;
public class program9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Gender: ");
		String gender=sc.nextLine();
		System.out.println("Enter the age: ");
		int age=sc.nextInt();
		String a="male";
		String b="female";
		if((gender.equals(b))&&(age>0 && age<59))
		{
			System.out.println("8.2% interest");
		}
		else if((gender.equals(b))&&(age>58 && age<101))
		{
			System.out.println("9.2% interest");
		}
		else if ((gender.equals(a))&&(age>0 && age<59))
		{
				System.out.println("8.4% interest");
		}
		else
			{
				System.out.println("10.5% interest");
			}
	}
}
