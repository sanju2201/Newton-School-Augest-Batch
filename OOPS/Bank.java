/*
interface IBank{
    public void deposit(int fund);
    public boolean withdraw(int fund);
    public int getBalance();
    public  int getAccountNumber();
}
*/

//implement interface here

class Bank implements IBank{
    public String name;
    public int balance;
    public int accountNumber;

    Bank(int balance, String name, int accountNumber){
        this.balance = balance;
        this.name = name;
        this.accountNumber = accountNumber;
    }

    public void deposit(int fund)
    {
        balance += fund;
    }
    public boolean withdraw(int fund){
      if(fund<balance){
      balance -= fund;
      return true;
      }
      return false;

       
    }
    public int getBalance(){
        return balance;
    }
    public  int getAccountNumber(){
        return accountNumber;
    }
}
