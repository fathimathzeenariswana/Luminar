package pkg;
import java.util.Scanner;
public class Avgqn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Avgqn ob=new Avgqn();
		System.out.println("enter 3 numbers");
		double n1=sc.nextInt();
		double n2=sc.nextInt();
		double n3=sc.nextInt();
		double answer=ob.average(n1, n2, n3);
		System.out.println("average of "+n1+" "+n2+" "+n3+"="+answer);
				

	}
	
	public double average(double a, double b, double c)
	{
		double r=a+b+c;
		double avg=r/3;
		return avg;
	}

}
