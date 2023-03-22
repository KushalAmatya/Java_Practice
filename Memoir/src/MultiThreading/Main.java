package MultiThreading;

public class Main {
    public static void main(String[] args) {

        Process1 p1 = new Process1();
        Process2 p2 = new Process2();
        p1.start();
        p2.start();

    }
}
class Process1 extends Thread{
    public void run(){
        for (int i =0;i<100;i++){
            System.out.println("Process 1 calling");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
class Process2 extends Thread{
    public void run(){
        for (int i =0;i<100;i++){
            System.out.println("Process 2 calling");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
