package pkg;
import java.util.Scanner;
public class posneg {

	public static void main(String[] args) {
		Scanner pn=new Scanner(System.in);
		System.out.println("enter a number");
		int number=pn.nextInt();
		if(number>0)
		{
			System.out.println("number is positive");
		}
		else if (number==0)
		{
			System.out.println("number is 0");
		}
		else
		{
			System.out.println("number is negative");
		}

	}

}
