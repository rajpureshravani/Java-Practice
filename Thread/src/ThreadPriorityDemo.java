class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " Priority : " + getPriority());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " : " + i);
        }
    }
}

public class ThreadPriorityDemo {

    public static void main(String[] args) {

        MyThread t1 = new MyThread("Low");
        MyThread t2 = new MyThread("Normal");
        MyThread t3 = new MyThread("High");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }
}