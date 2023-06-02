package pkg;
import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		Scanner multiary=new Scanner(System.in);
		int ar[][]=new int[3][2];
		System.out.println("enter numbers");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
				{
				ar[i][j]=multiary.nextInt();
				}
			
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}

	}

}
