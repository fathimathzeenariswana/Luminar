package pkg;
import java.util.Scanner;
public class Primecode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Primecode ob=new Primecode();
		System.out.println("enter number");
		int num=sc.nextInt();
		System.out.println("number="+num);
		ob.prime(num);

	}
	
	public void prime(int a)
	{
		boolean b=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				b=false;
			}
		}
		if(b)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not prime number");
		}
	}

}
