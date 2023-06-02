package pkg;
import java.util.Scanner;
public class Countstring {

	public static void main(String[] args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter the string");
		String s=c.nextLine();
		int l=s.length();
		System.out.println("length of string= "+l);
		int count=0;
		for(int i=0;i<l;i++)
		{
			if(s.charAt(i)!=' ')
			{
				count=count+1;
			}


		}
		System.out.println("count= "+count);


	}

}
