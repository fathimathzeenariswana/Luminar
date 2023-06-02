package pkg;
import java.util.Scanner;
public class Largecode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Largecode ob=new Largecode();
		int ar[]=new int[5];
		System.out.println("enter the numbers");
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("numbers are");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		int largevalue=ob.large(ar);
		System.out.println("largest element ="+largevalue);
		

	}
	
	public int large(int a[])
	{
		int temp=a[0];
		int l=a.length;
		for(int i=0;i<l;i++)
		{
			if(a[i]>temp)
			{
				temp=a[i];
			}
		}
		return temp;
	}

}
