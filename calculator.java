package pkg;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		Scanner cal=new Scanner(System.in);
		int optn;
		do {
		System.out.println("enter 1st number");
		int num1=cal.nextInt();
		System.out.println("enter 2nd number");
		int num2=cal.nextInt();
		System.out.println("1= Add");
		System.out.println("2= Subtract");
		System.out.println("3= Multiply");
		System.out.println("4= Divide");
		System.out.println("enter operation to perform");
		optn=cal.nextInt();
		switch(optn)
		{
		case 1: System.out.println(num1+num2);
		break;
		case 2: System.out.println(num1-num2);
		break;
		case 3: System.out.println(num1*num2);
		break;
		case 4: System.out.println(num1/num2);
		break;
		default: System.out.println("wrong number");
		
		}
		}while(optn<=4);

	}

}
