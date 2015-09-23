import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
		
	// a private int data field named id for the account with default 0
	private int id = 0;
	
	// a private double data field named balance for the account with default 0
	private double balance = 0;
	
	// a private double data field named annualInterestRate that stores the current interest rate with default 0
	public double annualInterestRate = 0;

	// a private Date data field named dateCreated that stored the date when the account was created
	private Date dateCreated;
	// the private Date data field stores the date when the account was created
	private Date accountDate = new Date();
	
	
	// return the date the account was created which is "accountDate"
	private Date getAccountDate(){
		return accountDate;
	}
	
	
	// a no-arg constructor that creates a default account
	public Account(){
		super();
	}

	
	// a constructor that creates an account with the specified id and initial balance
	public Account(int id, double balance){
		super();
			this.id = id;
			this.balance = balance;
	}
	
	
	// the accessor methods for id, balance, and annualInterestRate
	public int getId(){
		return id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public double getAnnualInterestRate(){
		return annualInterestRate;
	}
	
	// the mutator methods for id, balance, and annualInterestRate
	public void setId(int newId){
		id = newId;
	}
	
	public void setBalance(double newBalance){
		balance = newBalance;
	}
	
	public void setAnnualInterestRate(double newAnnualInterestRate){
		this.annualInterestRate = newAnnualInterestRate;
	}
	
	
	// the accessor method for dateCreated
	public Date getDateCreated(){
		return dateCreated;
	}
	
	
	// a method named "getMonthlyInterestRate()" that returns the monthly interest rate
	public double getMonthlyInterestRate(){
		return annualInterestRate / 12;		
	}
	
	// a method that withdraws a specified amount from the account
	public void Withdraw(double withdraw) throws
							InsufficientFundsException
	{
		if(withdraw <= balance)
		{
			balance = balance - withdraw;
		}
		else
		{
			double needs = withdraw - balance;
			throw new InsufficientFundsException(needs);
		}
	}
	
	
	// a method that deposits a specified amount to the account
	public void Deposit(double deposit){
		balance = balance + deposit;
	}
		
}