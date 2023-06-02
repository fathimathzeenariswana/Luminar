package pkg;
import java.util.Scanner;
public class Arraysum {

	public static void main(String[] args) {
		Scanner sum=new Scanner(System.in);
		int n;
		System.out.println("enter the size");
		n=sum.nextInt();
		int ar[]=new int[n];
		System.out.println("enter numbers");
		for(int i=0;i<n;i++)
		{
			ar[i]=sum.nextInt();
		}
		int s=0;
		for(int j=0;j<n;j++)
		{
			s=s+ar[j];
		}
		System.out.println("sum="+s);
		int avg;
		avg=(s/n);
		System.out.println("average="+avg);
		
	}

}
