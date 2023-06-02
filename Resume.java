package oops;

interface details
{
	public void personaldetails(String a, long b, String c, String d);
	public void class12(String a, String b);
	public void class10(String a, String b);
	public void btech(String a, String b);
	public void skills(String a, String b);
	public void project(String a, String b);
}

class resumedetails implements details
{

	@Override
	public void personaldetails(String a, long b, String c, String d) {
		System.out.println("NAME: "+a);
		System.out.println("PHONE: "+b);
		System.out.println("PLACE: "+c);
		System.out.println("DOB: "+d);
		System.out.println();
		System.out.println("EDUCATION");
		
	}

	@Override
	public void class12(String a, String b) {
		System.out.println("CLASS XII");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
		
	}

	@Override
	public void class10(String a, String b) {
		System.out.println("CLASS X");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
	}

	@Override
	public void btech(String a, String b) {
		System.out.println("BTECH");
		System.out.println(a);
		System.out.println(b);
		System.out.println();
		
	}

	@Override
	public void skills(String a, String b) {
		System.out.println("SKILLS");
		System.out.println("Technical Skills:");
		System.out.println(a);
		System.out.println();
		System.out.println("Soft Skills:");
		System.out.println(b);
		System.out.println();
		
		
	}

	@Override
	public void project(String a, String b) {
		System.out.println("PROJECT");
		System.out.println("1."+a);
		System.out.println("2. "+b);
		System.out.println();
		
	}

	
}

public class Resume {

	public static void main(String[] args) {
		resumedetails ob=new resumedetails();
		ob.personaldetails("Fathimath Zeena Riswana", 8129254593l, "Kochi", "06/JUNE/1998");
		ob.btech("Federal Institute of Science and Technology", "CGPA=7.23");
		ob.class12("Vaduthala Jama-Ath Higher Secondary School", "Percentage=91");
		ob.class10("Mount Seena English School", "Percentage=96");
		ob.skills("java"+"\n"+"python"+"\n"+"SQL", "disciplined"+"\n"+"confident"+"\n"+"punctual");
		ob.project("Steganography", "Wireless Notice Board");
		

	}
	
	

}
