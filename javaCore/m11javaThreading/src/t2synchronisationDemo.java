public class t2synchronisationDemo implements Runnable {

    private Account jointAccount = new Account();
    public void run(){
        for(int i=0;i<5;i++){
            withdraw(10);
            if(jointAccount.getBal() < 0)
                System.out.println(" The value in joint account is "+jointAccount.getBal());
        }
    }

    public synchronized void withdraw(int amt){
        //synchronized(this){
        if(amt > jointAccount.getBal()){
            System.out.println("The amount is greater than available balance "+Thread.currentThread().getName());
        }else{
            System.out.println("The balance is available for owner "+Thread.currentThread().getName());
            jointAccount.withdrawAmt(amt);
        }
        //}
    }

    public static void main(String args[]){
        t2synchronisationDemo jointAcctService = new t2synchronisationDemo();
        Thread tom=new Thread(jointAcctService);
        tom.setName("Tom");

        Thread harry=new Thread(jointAcctService);
        harry.setName("Harry");

        tom.start();
        harry.start();
    }
}
class Account{
    private int bal=50;
    public int getBal(){
        return this.bal;
    }
    public void withdrawAmt(int amt){
        bal = bal - amt;
    }
}
