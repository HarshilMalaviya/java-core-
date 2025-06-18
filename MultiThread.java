import java.util.Scanner;

public class MultiThread {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"Raj");
        Customer c2 = new Customer(a1,"Dhyey");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();

    }
}
class Account{
    int balance ;
    Account(int balance){
        this.balance=balance;
    }
    public boolean isSufficientBalance(int amount){
        if (balance>=amount){
            return true;
        }else {
            return false;
        }
    }
    public void withdraw(int amount){
        this.balance=balance-amount;
    }
}
class Customer implements Runnable{
    Account a1;
    String name;
    Customer(Account a1,String name){
        this.a1=a1;
        this.name=name;
    }
    public void run(){ // senchronized keyword is use to sechronize the whole function
            Scanner s1 = new Scanner(System.in);
            System.out.println(name + " Enter the amount to withdraw");
            int amount = s1.nextInt();
        synchronized (a1) { // synchronized() block use when need is to senchronize the block of code as below

            if (a1.isSufficientBalance(amount)) {
                a1.withdraw(amount);
                System.out.println(amount + " Withdrawal successful");
                System.out.println("current balance " + a1.balance);
            } else {
                System.out.println(name + " Gareeb !!");
            }

        }
    }
}
