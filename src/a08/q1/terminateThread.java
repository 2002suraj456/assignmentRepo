package a08.q1;

import java.io.IOException;

class myClass extends Thread {

    @Override
    public void run() {
        try {
            while(true)
            {
                System.out.println("thread is running");
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
        }
    }
}

public class terminateThread {
    public static void main(String[] args) throws IOException {

        myClass threadObj = new myClass();

        System.out.println("To stop thread execution press enter");
        threadObj.start();
        
        int read = System.in.read();
        threadObj.interrupt();
    }

}
