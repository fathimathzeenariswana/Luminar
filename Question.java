package oops;

class member
{
	String name, address;
	int age, salary;
	long phone;
	
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
		System.out.println(salary);
	}
}

class employee extends member
{
	String department;
	public void print()
	{
		System.out.println(department);
	}
}

class manager extends member
{
	String specialization;
	public void print()
	{
		System.out.println(specialization);
	}
}
public class Question {

	public static void main(String[] args) {
		employee ob=new employee();
		ob.name="riswana";
		ob.age=24;
		ob.phone=8129254593l;
		ob.address="sibin cottage";
		ob.salary=15000;
		ob.department="testing";
		ob.printdetails();
		ob.print();
		
		manager ob1=new manager();
		ob1.name="anjel";
		ob1.age=24;
		ob1.phone=8129256793l;
		ob1.address="love shore";
		ob1.salary=24000;
		ob1.specialization="btech";
		ob1.printdetails();
		ob1.print();

	}

}
