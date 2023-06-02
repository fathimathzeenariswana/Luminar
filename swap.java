package pkg;

public class swap {

	public static void main(String[] args) {
//swap
		int a=40, b=60;
		System.out.println("before swapping "+"a="+a +" b="+b);
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println("after swapping "+"a="+a +" b="+b);
		
		int c=50, d=30;
		System.out.println("before swapping "+"c="+c +" d="+d);
		System.out.println("c="+((c+d)-c));
		System.out.println("d="+((c+d)-d));
		
		int f=20, g=40;
		System.out.println("before swapping "+"f="+f +" g="+g);
		f=f+g; //60
		g=f-g;
		f=f-g;
		System.out.println("after swapping "+"f="+f +" g="+g);
		
		

	}

}


