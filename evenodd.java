package pkg;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		Scanner check=new Scanner(System.in);
		System.out.println("enter a number");
		int number=check.nextInt();
		if((number%2)==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
		

	}

}
