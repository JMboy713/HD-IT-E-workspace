package thread;

class Sleep_1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

        }
        System.out.println("<<thread1 종료>>");
    }

}

class Sleep_2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
        System.out.println("<<thread2 종료>>");

    }
}

public class SleepTest {
    public static void main(String[] args) {
        Thread t1 = new Sleep_1();
        Thread t2 = new Sleep_2();
        t1.start();
        t2.start();
        System.out.println("<<Main Thread 종료>>");
    }

}
