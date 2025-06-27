package Threading.Locks;

public class BankAccount {
    private int balance = 1000;

    public  synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() +" ATTEMPTING TO WITHDRAW " + amount);
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " PROCESSING WITHDRAWAL OF " + amount);
            try {
                Thread.sleep(10000 );
            } catch (InterruptedException e) {

            }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " WITHDRAWAL OF " + amount + " COMPLETED. NEW BALANCE IS " + balance);
    }
    else {
        System.out.println(Thread.currentThread().getName() + " INSUFFICIENT FUNDS FOR WITHDRAWAL  " + amount);
        }
    }
}

