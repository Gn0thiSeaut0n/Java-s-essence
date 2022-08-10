public class Ex10_09 {
    public static void main(String[] args) {
        ThreadEx9_1 th1 = new ThreadEx9_1();
        ThreadEx9_2 th2 = new ThreadEx9_2();
        th1.start();
        th2.start();

        delay(2 * 1000);
        System.out.println("<<main 종료>>");
    }

    static void delay(long millis) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }
}

class ThreadEx9_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
        }
    }
}


class ThreadEx9_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
        }
    }
}