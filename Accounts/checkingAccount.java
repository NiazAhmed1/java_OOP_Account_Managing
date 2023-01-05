package first;

//checkingAccount is a derived class inherit from Base class (Account) 
public class checkingAccount extends Account {
	
	
	
	//Member function type double 
	//show charge per Transaction
	private double transactionCharge;
	
	
	
	
	//Constructor
	public checkingAccount(double balance,double feeAmount)
	{
	
		//constructor of base class
		super(balance);
		//set or initialize value of Charge per Transaction
	    setTransaction(feeAmount);
	
	}
	
	
	
	
	//setter method used to set the value of TransactionCharge
	//constructor must be initial value of transactionCharge grater than or equal to zero
	public void setTransaction(double fee)
	{
		
		
		//if value of parameter is greater than or equal to 0 then it initialize to transactionCharge
		if(fee >= 0.0)
			transactionCharge=fee;
		//other wise show Exception;
		else
			throw new IllegalArgumentException("Transection fee must be greater than or equal to 0 ");
	
	}
	

	
	//getter method return value of transactionCharge 
	public double getTransaction()
	{
		return transactionCharge;
	}
	
	
	
	//Redefine credit function which subtract transactionCharge from AccountBalance 
	public void credit(double amount)
	{
		
		
		//call credit method of base class (Account)
		super.credit(amount);	
		//call chargeFee 
		//That set AcountBalance by subtract transactionCharge from AccountBalance 
		chargeFee();
		
	}
	
	
	
	
	//Redefine debit function which subtract transactionCharge from AccountBalance 
	public boolean debit(double amount)
	{
		
		
		//initialize or assign sc to debit method of Base class(Account) 
		boolean sc=super.debit(amount);
		
		if(sc)
		{
			//call chargeFee 
			//That set AcountBalance by subtract transactionCharge from AccountBalance 
			chargeFee();
			return true;
		}
		else
			return false;
		
		
	}
	
	
	
	//ChargeFee method that Set AccountBalance by subtract transactionCharge from AccountBalance
	public void chargeFee()
	{
		
		
		//if TrasactionCharge is less than or equal to AccountBalance 
		//then subtract transaction charge from AccountBalance
		if(getTransaction() <= getBalance() && getTransaction() >=0.0)
		{
		super.setBalance(getBalance() - getTransaction());
		}
		//otherwise show Exception
		else
			throw new IllegalArgumentException("AccountBalance is Less than Transection Charge");
	
	}
	
	
	
	//toString method which format only two digit after decimal point in the value of AccountBalance
	public String toString()
	{
		
		return String.format("%.2f",getBalance());
	
	}
	
	
}
