public class Bank {
    private int bank_account;
    protected final int MAX_ACCOUNT_VALUE = 1337;
    protected final int MIN_ACCOUNT_VALUE = 0;

    public Bank(int bank_account) {
        if (bank_account < 1)
            throw new IllegalArgumentException("Incorrect account value!");
        this.bank_account = bank_account;
    }

    public int getBank_account() {return bank_account;}

    public void setBank_account(int bank_account) {
        if (bank_account < 1)
            throw new IllegalArgumentException("Incorrect account value!");
        this.bank_account = bank_account;
    }

    public void Increment(){
        System.out.println("Inc. Start: " + bank_account);
        for(; bank_account < MAX_ACCOUNT_VALUE; bank_account += 2){
            System.out.println("inc: " + bank_account);
        }
        System.out.println("Inc. Finish: " + bank_account);
    }

    public  void Decrement(){
        System.out.println("Dec. start: " + bank_account);
        for(; bank_account > MIN_ACCOUNT_VALUE; bank_account--){
            System.out.println("Dec. : " + bank_account);
        }
        System.out.println("Dec. finish: " + bank_account);
    }
}
