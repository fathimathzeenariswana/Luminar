package oops;

class parentdetails
{
	public void phone()
	{
		System.out.println("samsung");
	}
	public void education()
	{
		System.out.println("bcom");
	}
}

class childdetails extends parentdetails
{

	@Override
	public void phone() {
		System.out.println("iphone");
		super.phone();
	}
	@Override
	public void education()
	{
		System.out.println("btech");
		super.education();
	}
	
}

public class Overridingcode {

	public static void main(String[] args) {
		childdetails ob=new childdetails();
		ob.phone();
		ob.education();

	}

}
