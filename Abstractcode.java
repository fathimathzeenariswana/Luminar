package oops;

abstract class calc
{
	abstract public void add(int a, int b);
	abstract public void sub(int a, int b);
	abstract public void mul(int a, int b);
	public void div(int a, int b)
	{
		int c=a/b;
		System.out.println(a+"/"+b+"="+c);
	}
}

class calcoptn extends calc
{

	@Override
	public void add(int A, int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
		
	}

	@Override
	public void sub(int A, int b) {
		int c=a-b;
		System.out.println(a+"-"+b+"="+c);
		
	}

	@Override
	public void mul(int A, int b) {
		int c=a*b;
		System.out.println(a+"*"+b+"="+c);		
	}
	
}
public class Abstractcode {

	public static void main(String[] args) {
		calcoptn ob=new calcoptn();
		ob.add(12, 45);
		ob.sub(23, 4);
		ob.mul(34, 2);
		ob.div(25, 5);

	}

}
