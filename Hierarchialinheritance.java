package oops;

class animal
{
	public void sleep()
	{
		System.out.println("Sleep details");
	}
}

class dog extends animal
{
	public void dogg()
	{
		System.out.println("Dog details");
	}
}

class cat extends animal
{
	public void catt()
	{
		System.out.println("cat details");
	}
}
public class Hierarchialinheritance {

	public static void main(String[] args) {
		dog ob=new dog();
		ob.sleep();
		ob.dogg();
		cat ob1=new cat();
		ob1.sleep();
		ob1.catt();

	}

}
