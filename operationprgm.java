package pkg;

import java.util.Scanner;

public class operationprgm {

	public static void main(String[] args) {
		
		Scanner div=new Scanner(System.in);
		System.out.println("enter value of a");
		double a=div.nextInt();
		System.out.println("enter the value of b");
		double b=div.nextInt();
		double c=a/b;
		System.out.println("divided value="+c);

	}

}
