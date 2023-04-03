package practice_exercise_3_9;

public class SavingsAccountTester
{
    public static void main(String[] args)
    {
        SavingsAccount TrystenAccount=new SavingsAccount(1000, 0.10);
        TrystenAccount.addInterest();
        System.out.println("Trysten balance="+ TrystenAccount.getBalance());
    }


}
