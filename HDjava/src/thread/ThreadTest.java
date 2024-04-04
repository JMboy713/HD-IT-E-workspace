package thread;

class MyThread extends Thread {
    // 독립적인 실행 단위

    @Override
    public void run() {
        // thread의 실행 코드가 나온다.
        System.out.println("t1");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("t2");
    }
}

public class ThreadTest {
    // main thread
    public static void main(String[] args) {
        MyThread t1 = new MyThread(); // thread를 생성
        t1.start(); // Thread의 실행
        // start 는 non-blocking method이다.
        // start 는 thread scheduler 에게 thread를 실행시켜달라고 요청.
        MyRunnable r2 = new MyRunnable(); // thread를 생성
        Thread t2 = new Thread(r2);
        t2.start();



    }
}
