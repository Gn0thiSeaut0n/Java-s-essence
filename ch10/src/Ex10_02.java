public class Ex10_02 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadEx10_1 th1 = new ThreadEx10_1();
        ThreadEx10_2 th2 = new ThreadEx10_2();
        th1.start();
        th2.start();
        startTime = System.currentTimeMillis();

        try {
            th1.join(); //main 쓰레드가 th의 작업이 끝날 때까지 기다린다.
            th2.join();
        } catch (InterruptedException e) {
            e.getStackTrace();
        }

        System.out.print("소요시간:   " + (System.currentTimeMillis() - startTime));
    }
}

class ThreadEx10_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("-"));
        }
    }
}

class ThreadEx10_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print(new String("|"));
        }
    }
}