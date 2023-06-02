package pkg;
import java.util.Scanner;
public class Plicode {

	public static void main(String[] args) {
		//int reverse;
		Scanner pali=new Scanner(System.in);
		System.out.println("enter a number");
		int num=pali.nextInt();
		
		int t;
		int reverse = 0,r;
		t=num;
		while(num!=0)
		{
			r=num%10;
			reverse=reverse*10+r;
			num=num/10;
			
		}
		System.out.println("number is "+t);
		System.out.println("reversed number is "+reverse);
		if(t==reverse)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
