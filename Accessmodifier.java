package oops;

class a
{
	private int n=20;
	int r=40;
	void add()
	{
		System.out.println("add");
	}
	
}

public class Accessmodifier {
	protected int t=29;

	public static void main(String[] args) {
		Accessmodifier ob=new Accessmodifier();
		a ob1=new a();
		System.out.println(ob1.r);
		ob1.add();
		System.out.println(ob.t);

	}

}
