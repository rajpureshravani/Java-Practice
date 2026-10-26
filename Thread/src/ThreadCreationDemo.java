
class Mythread extends  Thread{

    public void run() {
        for(int i=1 ;i<=5;i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

public class ThreadCreationDemo {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        obj.start();
    }
}
