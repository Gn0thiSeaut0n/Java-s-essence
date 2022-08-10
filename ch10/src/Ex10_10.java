import javax.swing.*;

public class Ex10_10 {
    public static void main(String[] args) {

        ThreadEx_1 th1 = new ThreadEx_1();
        th1.start();
        System.out.println("isInterrupted: " + th1.isInterrupted());
        String input = JOptionPane.showInputDialog("아무 값이나 입력");
        System.out.println("입력하신 값은 " + input + "입니다.");
        th1.interrupt();

        System.out.println("isInterrupted(): " + th1.isInterrupted());
        System.out.println("isInterrupted(): " + th1.isInterrupted());

        System.out.println("interrupted(): " + Thread.interrupted());
    }
}

class ThreadEx_1 extends Thread {
    public void run() {
        int i = 10;

        while (i != 0 && isInterrupted()) {
            System.out.println(i--);
            for (long x = 0; x < 25000000000L; x++);
        }

//        System.out.println("isInterrupted(): " + this.isInterrupted());
//        System.out.println("isInterrupted(): " + this.isInterrupted());
//        System.out.println("interrupted(): " + Thread.interrupted());

        System.out.println("카운트 종료");
    }
}