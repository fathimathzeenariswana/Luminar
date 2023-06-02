package pkg;
import java.util.Scanner;
public class Multicode {

	public static void main(String[] args) {
		Scanner multi=new Scanner(System.in);
		System.out.println("enter a number");
		int num=multi.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
		}

	}

}
