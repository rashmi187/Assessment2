package module5;
class AlternatePrinter {
    int number = 1;
    boolean turn = true;

    synchronized void printThread1() {
        for (int i = 1; i <= 5; i++) {
            while (!turn) {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            System.out.println("Thread1: " + number++);
            turn = false;
            notify();
        }
    }

    synchronized void printThread2() {
        for (int i = 1; i <= 5; i++) {
            while (turn) {
                try {
                    wait();
                } catch (Exception e) {
                }
            }
            System.out.println("Thread2: " + number++);
            turn = true;
            notify();
        }
    }
}


public class TwoThreadsAlternate {

    public static void main(String[] args) {

        AlternatePrinter obj = new AlternatePrinter();

        Thread t1 = new Thread(() -> obj.printThread1());
        Thread t2 = new Thread(() -> obj.printThread2());

        t1.start();
        t2.start();
    }
}
