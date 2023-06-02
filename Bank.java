package oops;

interface profile
{
	static int minimum=3000;
	public void accountdetails();
	public void deposit(int n);
	public void withdrawal(int n);
	public void balance();
}

class accountdetails implements profile
{
	int balance=0;
	@Override
	public void deposit(int n) {
		int deposit=n;
		System.out.println(deposit+"rupees deposited");
		balance=minimum+deposit;
		System.out.println("balance="+(balance-minimum));
		System.out.println();
	}

	@Override
	public void withdrawal(int n) {
		int withdrawn=0;
		if((balance-n)>=3000)
		{
			withdrawn=n;
		    System.out.println(withdrawn+"rupees withdrawed");
		}
		else
		{
			System.out.println("no enough balance");
		}
		balance=balance-withdrawn;
		System.out.println("balance="+(balance-minimum));
		System.out.println();
	}

	@Override
	public void accountdetails() {
		long accountnumber=17140100034227l;
		String name="fathimath zeena riswana";
		String address="karunnapallil house";
		String branch="palluruthy";
		System.out.println("ACCOUNT DETAILS");
		System.out.println("account number="+accountnumber);
		System.out.println("name="+name);
		System.out.println("address="+address);
		System.out.println("branch="+branch);
		System.out.println();
		
	}

	@Override
	public void balance() {
		System.out.println("balance="+(balance-minimum));
		
	}
	
}


public class Bank {

	public static void main(String[] args) {
		accountdetails ob=new accountdetails();
		ob.deposit(1000);
		ob.withdrawal(200);
		ob.accountdetails();
		ob.balance();
		
	}

}
