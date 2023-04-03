package practice_exercise_3_9;
//"Write a class SavingsAccount that is similar to the BankAccount class, except that it has an added instance variable interest.
// Supply a constructor that sets both the initial balance and the interest rate.
// Supply a method addInterest (with no explicit parameter) that adds interest to the account.
// Write a SavingsAccountTester class that constructs a savings account with an initial balance of $1,000 and an interest rate of 10 percent.
// Then apply the addInterest method and print the resulting balance.
// Also compute the expected result by hand and print it."
public class SavingsAccount
{
    private double balance;
    private double interest;
    public SavingsAccount()
    {
        balance = 0;
    }
    public SavingsAccount(double initialBalance, double interest)
    {
        balance = initialBalance;
        this.interest = interest;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        balance = balance - amount;
    }

    public void addInterest()
    {
        balance= balance + balance * interest;
    }
    public double getBalance()
    {
        return balance;
    }

}
