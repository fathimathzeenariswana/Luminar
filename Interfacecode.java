package pkg;

interface bakery
{
	void breakfast();
	public void lunch();
	public void dinner();
}

interface snacks
{
	public void cutlet();
	public void  samoosa();
}

class menu implements bakery,snacks
{

	@Override
	public void cutlet() {
		System.out.println("SNACKS");
		System.out.println("cutlet");
		
	}

	@Override
	public void samoosa() {
		System.out.println("samoosa");
		
	}

	@Override
	public void breakfast() {
		System.out.println("appam");
		System.out.println("beef");
		System.out.println("porotta");
		System.out.println("chicken");
		
	}

	@Override
	public void lunch() {
		System.out.println("LUNCH");
		System.out.println("biriyani");
		System.out.println("fried rice");
		System.out.println("meals");
		System.out.println();
		
	}

	@Override
	public void dinner() {
		System.out.println("DINNER");
		System.out.println("shawarma");
		System.out.println("alfaham");
		System.out.println("chapathi");
		System.out.println();
		
	}
	
}
public class Interfacecode {

	public static void main(String[] args) {
		menu ob=new menu();
		ob.lunch();
		ob.dinner();
		ob.cutlet();
		ob.samoosa();
		

	}

}
