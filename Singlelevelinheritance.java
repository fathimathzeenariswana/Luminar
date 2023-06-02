package oops;

class ec{
	public void eca()
	{
		System.out.println("EC A");
	}
}

class cs extends ec{
	public void csa()
	{
		System.out.println("CS A");
	}
}

public class Singlelevelinheritance {

	public static void main(String[] args) {
		cs ob=new cs();
		ob.eca();
		ob.csa();
	}

}
