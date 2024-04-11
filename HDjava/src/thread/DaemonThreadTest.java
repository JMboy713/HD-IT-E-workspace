package thread;

//class MyThreadRunnable implements Runnable {
//    @Override
//    public void run() {
//
//    }
//}

public class DaemonThreadTest implements Runnable{
    static Boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new DaemonThreadTest());
        t.setDaemon(true);
        t.start(); // 언젠가는 이 thread가 동작하게 된다.
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);// Thread 클래스를 이용해서 Thread를 재울때 특정 thread를 재우기 어렵다.
                // 현재 실행되고 있는 thread를 재운다.
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i의 값은 : "+i);
            if (i == 5) {
                autoSave = true;
            }
        }

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000); //thread가 자고 있는데 건드리면 exception 발생
            } catch (InterruptedException e) {
                System.out.println("오류 발생");
            }
            if (autoSave) {
                System.out.println("자동 저장 되었음");
            }
        }
    }
}
