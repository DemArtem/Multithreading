package basic;

public class ThreadDemo extends Thread{
    public static void main(String[] args) {
        System.out.println("Main: "+Thread.currentThread().getName());
        System.out.println("Creating child thread");
        Thread thread = new ThreadDemo();
    }
}
