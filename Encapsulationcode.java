package oops;

class emp
{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class Encapsulationcode {

	public static void main(String[] args) {
		emp e=new emp();
		e.setEmpid(100);
		e.setEmpname("riswana");
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
	

	}

}
