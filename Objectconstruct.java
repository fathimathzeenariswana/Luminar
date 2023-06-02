package oops;

public class Objectconstruct {
	int empid;
	String empname;
	String designation;

	public static void main(String[] args) {
		Objectconstruct e=new Objectconstruct();
		e.empid=100;
		e.empname="riswana";
		e.designation="tester";
		e.display();

	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(designation);
	}

}
