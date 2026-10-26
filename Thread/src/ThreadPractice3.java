
class NumbersThread extends Thread{

    public void run() {
        for(int i = 1 ; i <= 5 ; i++){

            System.out.println("Child Thread 1 : " + i);
        }
    }
}

class AlphabetThread extends Thread{

    public void run() {
        for (char ch = 'A'; ch <= 'E'; ch++) {
            System.out.println("Child Thread 2: "+ch);
        }
    }
}


public class ThreadPractice3 {
    public static void main(String[] args) {

        NumbersThread num = new NumbersThread();
        AlphabetThread al = new AlphabetThread();

        num.start();
        al.start();
    }
}
