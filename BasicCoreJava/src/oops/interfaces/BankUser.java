package oops.interfaces;

public class BankUser {

	public static void main(String[] args) {
		
		//RBI bank = new SBI();
		
		account( new SBI()); // SBI = chrome
		account( new HDFC()); // HDFC = firefox
		account( new ICICI()); // ICICI = Edge
		
    	String name = "Aklesh";
		int a=10;
		RBI bank1 = new SBI();
		
		sum(a);
		message(name);
		account(bank1);
		
		
		RBI obj;
		
		obj = new SBI();
		
		obj.creditCard();
		obj.currentAccount();
		obj.debitCard();
		obj.savingAccount();
		obj.bankName();
		
		obj = new HDFC();
		obj.creditCard();
		obj.currentAccount();
		obj.debitCard();
		obj.savingAccount();
		obj.bankName();
		
		obj = new ICICI();
		obj.creditCard();
		obj.currentAccount();
		obj.debitCard();
		obj.savingAccount();
		obj.bankName();
		
	}
	
	public static void account(RBI bank) // RBI = WebDriver
	{
	    bank.creditCard(); // navigate
		bank.currentAccount(); //click
		bank.debitCard();  //Enter Data
		bank.savingAccount(); // select option
	}
	
	public static void sum(int a)
	{
		System.out.println(10+a);
	}

	public static void message( String name)
	{
		System.out.println("Your Name is : "+name);
	}
}
