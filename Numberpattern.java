package pkg;

public class Numberpattern {

	public static void main(String[] args) {
		int i,j;
		int t=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print((t=t+1)+" ");
			}
			System.out.println();
		}

	}

}
