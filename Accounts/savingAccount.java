package first;

//class savingAccount derived from base class Account
public class savingAccount extends Account {
	
	
	//Member variable type double
	private double interestRate;
	
	
	//constructor 
	public savingAccount(double balance,double IR)
	{
		
		//Super show base class constructor
		super(balance);
		//set value of interestRate
		setInterest(IR);
		
		
	}
	
	
	//setter method for set the value for InterestRate
	//if value is greater or equal to 0 
	//then construct initialize otherwise show Exception
	
	public void setInterest(double rate)
	{
	
		
		if(rate >= 0.0)
			interestRate=rate;
		else
			throw new IllegalArgumentException("Interest rate must be greater than or equal to 0.0");
	
	
	}
	
	
	//getter method return interestRate
	public double getInterest()
	{
		
		return interestRate;
	}
	
	
	//calculateInterest method
	//calculate value of Interest Earned by multiply interestRate by AccountBalance 
	
	public double calculateInterest()
	{
		
		return getInterest()*getBalance();		
	}
	
	
	
	//toString method use to format only two digit after decimal point in the value of AccountBalance
	public String toString()
	{
		
		return String.format("%.2f",getBalance());
	}

}
