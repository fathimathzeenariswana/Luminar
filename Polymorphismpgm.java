package oops;

public class Polymorphismpgm {

	public static void main(String[] args) {
		Polymorphismpgm ob=new Polymorphismpgm();
		ob.add();
		ob.add(34, 56);
		ob.add(23.5, 56);
		ob.add(45, 56.9);

	}
	
	public void add()
	{
		int a=19, b=69;
		int c=a+b;
		System.out.println(c);	
	}
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		double c=a+b;
		System.out.println(c);
	}

}
