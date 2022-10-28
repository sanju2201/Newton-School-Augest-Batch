// your code goes here
class BankAccount{
    int balance;
    String name;

    BankAccount(int balacne, String name){
        this.balance = balacne;
        this.name = name;
    }

    public void depositFund(int amount){
        int newBalance = balance+amount;
        balance = newBalance;

    }
    public boolean withdrawFund(int amount){
        int newBalance = balance-amount;
        balance = newBalance;
        if(balance>= 0){
            return true;
        }
     return false;
    } 
}
