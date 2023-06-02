package pkg;
import java.util.Scanner;
public class Stringpalindrome {

	public static void main(String[] args) {
		Scanner stg=new Scanner(System.in);
		System.out.println("enter string");
		String s=stg.nextLine();
		int l=s.length();
		String r="";
		
		for(int i=l-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		System.out.println(r);
		
		
		if(s.equals(r))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
