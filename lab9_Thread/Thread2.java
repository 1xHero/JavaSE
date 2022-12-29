public class Thread2 extends Thread{
    private Bank bank;

    public Thread2(Bank b){
        bank = b;
    }

    @Override
    public synchronized void run(){
        for (int i = bank.MIN_ACCOUNT_VALUE; i <= bank.MAX_ACCOUNT_VALUE; i++){
            bank.setBank_account(bank.getBank_account() - 1);
        }
        System.out.println("Decrement thread: " + bank.getBank_account());
    }
}
