package pkg;
import java.util.Scanner;

public class scannerpgm {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		System.out.println("number="+number);
		
		System.out.println("enter a decimal");
		float decimal=sc.nextFloat();
		System.out.println("decimal="+decimal);
		
		System.out.println("enter name");
		String name=sc.next();
		//String name=sc.nextLine();
		System.out.println("name="+name);
		

	}

}
