public class Main {
    public static void main(String[] args) {
    //dual thread prog.
        final Bank bank = new Bank(1);

        Thread1 thread1 = new Thread1(bank);
        Thread2 thread2 = new Thread2(bank);

        thread1.start();
        thread2.start();
    }
}
