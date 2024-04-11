package thread;

import javax.swing.*;
class MyThread3 extends Thread {
    @Override
    public void run() {
        int i = 10;
        while (i!=0&& !isInterrupted()) { // isInterrupted : 상태값 알아옴
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                interrupt(); // 깼는데 state가 초기화되어서 state를 다시 걸어야 한다.
                System.out.println("중간 종료");
            }
//            for(long k=0;k<2900000000L;k++); // 시간 지연용 코드
        }
        System.out.println("카운트가 종료되었습니다.");
    }
}

public class InterruptTest {
    public static void main(String[] args) {
        Thread t = new MyThread3();
        t.start();
        // 약간의 시간 지연 Swing을 이용
        String input = JOptionPane.showInputDialog("값을 입력하세요");
        System.out.println("입력된 값은 : " + input);
        t.interrupt();
    }
}
