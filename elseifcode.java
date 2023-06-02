package pkg;
import java.util.Scanner;
public class elseifcode {

	public static void main(String[] args) {
		Scanner prgrm=new Scanner(System.in);
		System.out.println("enter number 1");
		int num1=prgrm.nextInt();
		System.out.println("enter number 2");
		int num2=prgrm.nextInt();
		System.out.println("enter number 3");
		int num3=prgrm.nextInt();
		if((num1>=num2)&&(num1>=num3))
		{
			System.out.println("num1 is greater");
		}
		else if((num2>=num1)&&(num2>=num3))
		{
			System.out.println("num2 is greater");
		}
		else if((num3>=num1)&&(num3>=num2))
		{
			System.out.println("num3 is greater");
		}
//		else
//		{
//			System.out.println("wrong number");
//		}
	}

}
