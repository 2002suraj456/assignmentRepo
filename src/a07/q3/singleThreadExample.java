package a07.q3;

class myClass extends Thread {

    @Override
    public void run() {
        System.out.println("this is a newly created thread from the main() method ");
        System.out.println(Thread.currentThread().getName());
    }
}

public class singleThreadExample {
    public static void main(String[] args) {

        myClass myThread = new myClass();
        myThread.start();
    }
}
