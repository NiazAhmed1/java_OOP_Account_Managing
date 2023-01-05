package first;

//Account Class
public class Account {
	
	
	//Member Variable type double
	private double AccountBalance;


	
	//construct 
	public Account(double balance)
	{
		//set AccountBalance
		setBalance(balance);
	
	}	


	//setter method for set the value for AccountBalance
	//if value is greater or equal to 0 
	//then construct initialize otherwise show Exception
	
	public void setBalance(double b)
	{
		
		
		//if true
		if(b >= 0.0)
			AccountBalance=b;
		//if false
		else
			throw new IllegalArgumentException("Initial balance was Invalid");
	
	
	}


	//credit Method That add an amount in AccountBalance
	//no return any value
	
	public void credit(double amount)	
	{	
		
		AccountBalance=AccountBalance+amount;	

	}


	//Debit method that subtract certain Amount from AccountBalance  
	public boolean debit(double amount)
	{
		
		
		//if debit amount is greater than AccountBalance then show Error Message
		
		if(amount > AccountBalance)
		{
			System.out.println("Debit amount exceeded account balance");
			return false;
		}
		
		//if debit amount is less than AccountBalance then subtract debit amount from AccountBalance 
		else
		{
			AccountBalance= AccountBalance - amount;
			return true;
		}
		
			
	}    
	
	
	//getBalance return value of AccountBalance
	public double getBalance()
	{
		
		return AccountBalance;
	}
	
	
	//toString method use to format only two digit after decimal point in the value of AccountBalance
	public String toString()
	{
		
		return String.format("%.2f",getBalance());

	}
}


