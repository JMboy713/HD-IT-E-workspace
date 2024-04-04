package thread;

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName());

        }
    }

    public MyThread1(String name) {
        super(name);
    }
}

class MyRunnable2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName());// 실행되고 있는 스레드의 이름을 가져옴.
            // 실행이 될 때는 이 자체가 Thread가 되기 때문에 Thread의 이름을 가져옴
        }
    }

}


public class ThreadTest3 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("홍길동");

        MyRunnable2 r = new MyRunnable2();
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();

        String a = "aaaa";
        a.substring()
    }

}
