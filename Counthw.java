package pkg;
import java.util.Scanner;
public class Counthw {

	public static void main(String[] args) {
		Scanner countpgm=new Scanner(System.in);
		System.out.println("enter a number");
		int num=countpgm.nextInt();
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count=count+1;
		}
		System.out.println("count of number="+count);
		

	}

}
