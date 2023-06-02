package oops;

interface animal1
{
	public void eat();
	public void sleep();
}

class monkey
{
	public void jump()
	{
		System.out.println("monkey jump");
	}
	public void bite()
	{
		System.out.println("monkey bite");
	}
}

class human extends monkey implements animal1
{
	@Override
	public void eat() {
		System.out.println("animal eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("animal sleep");
		
	}
	
	public void speak()
	{
		System.out.println("human speak");
	}
	
}

public class Questioninterface {

	public static void main(String[] args) {
		human ob=new human();
		ob.jump();
		ob.bite();
		ob.eat();
		ob.sleep();
		ob.speak();
		
	}

}
