package pkg;

public class operators {

	public static void main(String[] args) {
//arithmetic operators
int a=30, b=10;
System.out.println("30+10="+(a+b));
System.out.println("30-10="+(a-b));
System.out.println("30*10="+(a*b));
System.out.println("30/10="+(a/b));
System.out.println("30%10="+(a%b));

//assignment operators
int c=40, d=20;
System.out.println("c="+(c+=d));
System.out.println("c="+(c-=d));
System.out.println("c="+(c*=d));
System.out.println("c="+(c/=d));

//relational operators
int f=10, g=15;
System.out.println("f==g "+(f==g));
System.out.println("f>g "+(f>g));
System.out.println("f<g "+(f<g));
System.out.println("f>=g "+(f>=g));
System.out.println("f<=g "+(f<=g));
System.out.println("f!=g "+(f!=g));

//logical operators
String username="riswana";
String password="riswana1#";
System.out.println(username=="riswana" && password=="riswana1#");
System.out.println(username=="riswa" && password=="riswana1#");
System.out.println(username=="riswa" || password=="riswana1#");
System.out.println(!(username=="riswana") && password=="riswana1#");

//unary operators
int r=20, s=30;
System.out.println(r++);
System.out.println(r);
System.out.println(r++);
System.out.println(++r);
System.out.println(s--);
System.out.println(s);
System.out.println(s--);
System.out.println(--s);


	}
}
