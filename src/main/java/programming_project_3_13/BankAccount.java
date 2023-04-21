package programming_project_3_13;
//"In this project, you will enhance the BankAccount class and see how abstraction and encapsulation enable evolutionary changes to software.
//			Begin with a simple enhancement: charging a fee for every deposit and withdrawal.
//			Supply a mechanism for setting the fee and modify the deposit and withdraw methods so that the fee is levied.
//			Test your class and check that the fee is computed correctly.
//			Now make a more complex change.
//			The bank will allow a fixed number of free transactions (deposits or withdrawals) every month, and charge for transactions exceeding the free allotment. The charge is not levied immediately but at the end of the month.
//			Supply a new method deductMonthlyCharge to the BankAccount class that deducts the monthly charge and resets the transaction count.
//			(Hint: Use Math.max(actual transaction count, free transaction count) in your computation.)
//			Produce a test program that verifies that the fees are calculated correctly over several months."
/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   private double fee = 0;
   private double count = 0;



   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {   
      balance = 0;
   }
   public void deductMonthlyCharge()
   {
     if (count >= 10)
      {
         balance = balance - (count-10) * fee;
      }
      count = 0;
   }
   /**
    Set the transaction fee amount for deposits and withrawals.
    @param transactionFee the initial balance
    */
   public void SetTransactionFee(double transactionFee)
   {
      fee = transactionFee;
   }
   public void setTrasactionCount(double transactionCount)
   {
      count = transactionCount ;
   }
   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
      Charges a transaction fee for the deposit.
   */
   public void deposit(double amount)
   {  
      balance = balance + amount;
      count ++;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdrawl
      Charges a transaction fee for the withdraw.
   */
   public void withdraw(double amount)
   {   
      balance = balance - amount ;
      count ++;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {   
      return balance;
   }
}

