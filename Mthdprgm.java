package pkg;

public class Mthdprgm {

	public static void main(String[] args) {
		Mthdprgm ob=new Mthdprgm();
		System.out.println("add");
		int v=ob.add(10,33);
		System.out.println(v);
		System.out.println("sub");
		ob.sub();
		System.out.println("mul");
		ob.mul(22, 5);
		System.out.println("div");
		double r=ob.div();
		System.out.println(r);

	}
	
	//method w para & w returntype
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	//method w/o para & w/o returntype
	public void sub()
	{
		int a=38,b=14,c;
		c=a-b;
		System.out.println(c);
	}
	
	//method w para & w/o returntype
	public void mul(int a, int b)
	{
		int c=a*b;
		System.out.println(c);
	}
	
	//method w/o para & w returntype
	public double div()
	{
		int a=33,b=2,c;
		c=a/b;
		return c;
	}
	

}
