package thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("너무 복잡..")).start();

    }
}
