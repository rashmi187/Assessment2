package module5;
    class LifeCycleThread extends Thread {
        public void run() {
            System.out.println("Thread is running");
        }
    }
    public class ThreadLifeCycleDemo {
        public static void main(String[] args) {
            LifeCycleThread t = new LifeCycleThread();
            System.out.println("State before start: " + t.getState());
            t.start();
            System.out.println("State after start: " + t.getState());
        }
    }

