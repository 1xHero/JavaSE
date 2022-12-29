public class Thread1 extends Thread{
    private Bank bank;

    public Thread1(Bank b){
        bank = b;
    }

    @Override
    public synchronized void run(){
        for (int i = bank.MIN_ACCOUNT_VALUE; i <= bank.MAX_ACCOUNT_VALUE; i++){
            bank.setBank_account(bank.getBank_account() + 2);
        }
        System.out.println("Increment thread: " + bank.getBank_account());
    }
}
