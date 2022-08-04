public class Ex10_07 {
    public static void main(String[] args) {
        ThreadEx7_1 th1 = new ThreadEx7_1();
        ThreadEx7_2 th2 = new ThreadEx7_2();

        th1.setPriority(9);
        th2.setPriority(3);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(|) : " + th2.getPriority());

        th1.start();
        th2.start();

    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("-");
            for (int x = 0; x < 1000000; x++) {
            }
        }
    }
}

class ThreadEx7_2 extends Thread {
    public void run() {
        for (int i = 0; i < 300; i++) {
            System.out.print("|");
            for (int x = 0; x < 1000000; x++) {
            }
        }
    }
}
