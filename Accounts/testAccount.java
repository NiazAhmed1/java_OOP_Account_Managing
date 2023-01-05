package first;

//Scanner class java.util.lang
import java.util.Scanner;



//Test class or Main class
public class testAccount {
	
	public static void main(String[] arg)
	{
		
		
		
		//object of class Account with Account balance 75.0
		Account account1=new Account(75.0);
		
		
		
		//object of class savingAccount with AccountBalance 25.0 and interestRate 0.03
		savingAccount account2=new savingAccount(25.0,0.03);
		
		
		
		//object of class checkingAccount with AccountBalance 100 and Transaction charge 2.0
		checkingAccount account3=new checkingAccount(100.0,2.0);
		
		
		
		
		//print Initial Balance of All Accounts (All object)
		System.out.println("\t\tINITIALE ACCOUNT BALANCE\t\t");
		
		System.out.println("............................................");
		System.out.println("Balance of Account1 = $"+account1.getBalance());
		System.out.println("Balance Of Account2 = $"+account2.getBalance());
		System.out.println("Balance of Account3 = $"+account3.getBalance());
		System.out.println(".............................................");
		
		System.out.println();
		System.out.println();
		
		
		
		//Create Object of Scanner class
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("..............................................");
		
		
		System.out.println("Enetr the value of Transaction Charge");
		//Take value of TransactionCharge from user
		double tc=input.nextDouble();
		//set the Value of Transaction charge
		account3.setTransaction(tc);
		
		
		
		System.out.println("Enter the value of InterestRate");
		//Take the value of InterestRate from user
		double ir=input.nextDouble();
		//set the value of InterestRate
		account2.setInterest(ir);
		
		
		System.out.println("...............................................");
		
		
		
		System.out.println("\t\tEnter The Credit Amount");
		
		
		System.out.println("..............................................");
		
		
		
		System.out.println("Enter Credit Amount for Account1 ");
		//Take credit Amount for account1 from user
		double credit1=input.nextDouble();
		//call credit method of Account1
		account1.credit(credit1);
		
		
		
		System.out.println("Enter The credit Amount for Account2");
		//Take credit Amount for Account2 from user
		double credit2=input.nextDouble();
		//call credit method of Account2
		account2.credit(credit2);
		
		
		
		System.out.println("Enter The credit Amount for Account3");
		//Take credit Amount for Account3 from user
		double credit3=input.nextDouble();
		System.out.println("Perform Transaction....");
		//call credit method of Account3
		account3.credit(credit3);
		
		
		
		
		System.out.println("..............................................");
		System.out.println();
		
		
		System.out.println("\t\tNow The Account Balance ");
		//Print AccountBalance of All Accounts after using credits method
		
		
		System.out.println("..............................................");
		System.out.println("Balance of Account1 = $" +account1.toString());
		System.out.println("Balance Of Account2 = $"+account2.toString());
		System.out.println("After Transaction :");
		System.out.println("Balance of Account3 = $"+account3.toString());
		System.out.println("...............................................");
		System.out.println();
		
		
		
		
		System.out.println("\t\tEnter The Debit Amount");
        System.out.println("..............................................");
		
        
        
		System.out.println("Enter debit Amount for Account1 ");
		//Take debit Amount for Account1 from user
		double debit1=input.nextDouble();
		//call debit method of Account1
		account1.debit(debit1);
		
		
		
		
		System.out.println("Enter The debit Amount for Account2");
		//Take debit Amount for Account2 from user
		double debit2=input.nextDouble();
		//call debit method of Account2
		account2.debit(debit2);
		
		
		
		
		System.out.println("Enter The debit Amount for Account3");
		//Take debit Amount for Account3 from user
		double debit3=input.nextDouble();
		//call debit method of Account3
		System.out.println("Perform Transaction....");
		account3.debit(debit3);
		
		
		System.out.println(".............................................");
		System.out.println();
		
		
		
		System.out.println("\t\tAfter withdraw Amount from The Account Balance\t\t ");
		//Print AccountBalance of All Accounts after using debit method
		
		
		
		System.out.println(".............................................");
		System.out.println("Balance of Account1 = $" +account1.toString());
		System.out.println("Balance Of Account2 = $"+account2.toString());
		System.out.println("After Transaction :");
		System.out.println("Balance of Account3 = $"+account3.toString());
		System.out.println(".............................................");
		System.out.println();
		
		
		
		
		
			
		System.out.println("........................................");
		
	
		double InterestEarned=account2.calculateInterest();
		//print InterestEarned which is calculate by using calculateInterest Method
		System.out.printf("%s %.2f","Interest Earned = $", InterestEarned);
		
		
		
		//pas InterestEarned in parameter of credit method of object of savingAccount class
		account2.credit(InterestEarned);
		//print New AccountBalance of Account2
		System.out.println("\nNEW BALANCE OF ACCOUNT2 = $" + account2.toString());
		
		
		
		System.out.println("........................................");
		
	}

}
