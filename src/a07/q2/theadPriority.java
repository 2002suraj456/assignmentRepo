package a07.q2;

class myClass extends Thread {

    private String threadName;

    myClass(String name) {
        threadName = name;
        System.out.println(threadName + " is created");
    }

    @Override
    public void run() {
        for(int i =0 ;i< 5;i++)
        {
            System.out.println(threadName  + " i = " + i);
            /* try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Excetion caught");
            } */
        }
    }
}
public class theadPriority {
    
    public static void main(String[] args) {

        myClass threadObj1 = new myClass("threadObj1");
        myClass threadObj2 = new myClass("threadObj2");
        myClass threadObj3 = new myClass("threadObj3");

        threadObj1.setPriority(10);
        threadObj2.setPriority(6);
        threadObj3.setPriority(4);

        threadObj1.start();
        threadObj2.start();
        threadObj3.start();
    }
}
