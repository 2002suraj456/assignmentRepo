// do not copy the code of this !!!!
// this is related to some other question!!!
package a08.q2;

class task1 extends Thread {
    @Override
    public void run() {
        System.out.println("task1 is running");
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.out.println("exception caught");
        }
    }
}
class task2 extends Thread {
    @Override
    public void run() {
        System.out.println("task2 is running");
        System.out.println(Thread.currentThread().getName());
    }
}
class task3 extends Thread {
    @Override
    public void run() {
        System.out.println("task3 is running");
        System.out.println(Thread.currentThread().getName());
    }
}
public class singleThreadMultipleTasks {
    public static void main(String[] args) {

        /* Thread newThread = new task1();
        newThread.start(); */
        Thread newThread;

        newThread = new task1();
        newThread.start();
        newThread = new task2();
        newThread.start();
        newThread = new task3();
        newThread.start();
    }
}
