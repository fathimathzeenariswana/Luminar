package oops;

public class Employeemethod {
	int empid;
	String empname;
	String designation;

	public static void main(String[] args) {
		Employeemethod e1=new Employeemethod();
		e1.values(100, "arya", "developer");
		e1.display();
		Employeemethod e2=new Employeemethod();
		e2.values(101, "amna", "tester");
		e2.display();

	}
	public void values(int empid, String empname, String designation)
	{
		this.empid=empid;
		this.empname=empname;
		this.designation=designation;
	}
	public void display()
	{
		System.out.print(empid+" ");
		System.out.print(empname+" ");
		System.out.print(designation+" ");
		System.out.println();
	}

}
