package pkg;
import java.util.Scanner;
public class Arnstrongprgrm {

	public static void main(String[] args) {
		Scanner arm=new Scanner(System.in);
		System.out.println("enter a number");
		int num=arm.nextInt();
		int sum=0;
		int t,r=0;
		t=num;
		while(num!=0)
		{
			r=num%10;
			sum=sum+(r*r*r);
			num=num/10;
		}
		if (t==sum)
		{
			System.out.println("armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
		

	}

}
