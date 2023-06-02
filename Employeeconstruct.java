package oops;

public class Employeeconstruct {
	int empid;
	String empname;
	String designation;
	public Employeeconstruct(int empid, String empname, String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}

	public static void main(String[] args) {
		Employeeconstruct e1=new Employeeconstruct(101,"riswana","tester");
		e1.display();
		Employeeconstruct e2=new Employeeconstruct(102,"riswa","tester");
		e2.display();
	}
	public void display()
	{
		System.out.print(empid+" ");
		System.out.print(empname+" ");
		System.out.print(designation+" ");
		System.out.println();
	}

}
