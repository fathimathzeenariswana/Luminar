package pkg;
import java.util.Scanner;
public class Vowelcode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vowelcode ob=new Vowelcode();
		System.out.println("enter a string");
		String s=sc.next();
		int value=ob.count(s);
		System.out.println("count= "+value);

	}
	public int count(String a)
	{
		int c=0;
		int l=a.length();
		for(int i=0; i<l; i++)
		{
			if(a.charAt(i)=='a'|| a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
			{
				c=c+1;
			}
			
		}
		return c;
	}

}
