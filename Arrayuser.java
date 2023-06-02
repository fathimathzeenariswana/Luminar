package pkg;
import java.util.Scanner;
public class Arrayuser {

	public static void main(String[] args) {
		Scanner arrays=new Scanner(System.in);
		int ar[]=new int[5];
		int i;
		System.out.println("enter the nunbers");
		for(i=0;i<5;i++)
		{
			ar[i]=arrays.nextInt();
		}
//		for(int v:ar)
//		{
//			System.out.println(v);
//		}
		for(int j=0;j<5;j++)
		{
			System.out.println(ar[j]);
		}
	}

}
