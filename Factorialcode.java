package pkg;
import java.util.Scanner;
public class Factorialcode {

	public static void main(String[] args) {
		Scanner fact=new Scanner(System.in);
		System.out.println("enter a number");
		int num=fact.nextInt();
		int i;
		int total=1;
		for(i=num;i>=1;i--)
		{
			total= total*i;
			
		}
		System.out.println(total);

	}

}
