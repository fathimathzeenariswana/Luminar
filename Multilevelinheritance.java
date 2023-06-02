package oops;

class fruits{
	public void apple()
	{
		System.out.println("APPLE");
	}
}

class vegetables extends fruits{
	public void carrot()
	{
		System.out.println("CARROT");
	}
}

class juice extends vegetables{
	public void avocado()
	{
		System.out.println("AVOCADO JUICE");
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		juice ob=new juice();
		ob.apple();
		ob.carrot();
		ob.avocado();

	}

}
