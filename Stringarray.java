package pkg;
import java.util.Scanner;
public class Stringarray {

	public static void main(String[] args) {
		Scanner stg=new Scanner(System.in);
		int s;
		System.out.println("enter the size");
		s=stg.nextInt();
		String ar[]=new String[s];
		System.out.println("enter names");
		for(int i=0;i<s;i++)
		{
			ar[i]=stg.next();
		}
		for(int j=0;j<s;j++)
		{
			System.out.println(ar[j]);
		}

	}

}
