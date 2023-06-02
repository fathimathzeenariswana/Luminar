package pkg;

public class Stringfnctns {

	public static void main(String[] args) {
		String s1="hello";
		String s2="Welcome to luminar";
		String s3="Hello";
		String s4="      selenium";
		
		//concat
		System.out.println(s1.concat(s2));
		
		//equals
		System.out.println(s1.equals(s3));
		//equalsignorecase
		System.out.println(s1.equalsIgnoreCase(s3));
		
		//upperlower
		System.out.println(s3.toUpperCase());
		System.out.println(s3.toLowerCase());
		System.out.println();
		
		//split
		String arr[]=s2.split(" ");
		for(String v:arr)
		{
			System.out.println(v);
		}
		System.out.println();
		
		//trim
		System.out.println(s4.trim());
		
		//startswith endswith
		System.out.println(s2.startsWith("Welcome"));
		System.out.println(s2.endsWith("luminar"));
		
		//Charat
		System.out.println(s3.charAt(2));
		
		//contains
		System.out.println(s3.contains("ello"));
		
		//substring
		System.out.println(s3.substring(1,4));
		
		//length
		System.out.println(s2.length());
	}

}
