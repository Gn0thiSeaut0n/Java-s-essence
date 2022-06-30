import java.util.ArrayList;

public class RoundTest {
    public static void main(String[] args) {
//        double sum = 0;
//        double sum1 = 0;
//        double sum2 = 0;
//
//        for (double d = 1.5; d <= 10.5; d++) {
//            double d1 = Math.round(d);
//            double d2 = Math.rint(d);
//
//            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);
//
//            sum += d;
//            sum1 += d1;
//            sum2 += d2;
//        }
//
//        System.out.println("-------------------------------------------");
//        System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
//        int i = Integer.parseInt("100");


//        System.out.println("i = " + Integer.parseInt("100"));
//        System.out.println("i = " + Integer.parseInt("100", 8));
//        System.out.println("i = " + Integer.parseInt("100", 2));
//        System.out.println("i = " + Integer.parseInt("FF", 16));

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(new Integer(100)); // lists에는 객체만 추가 가능
        list.add(100); // JDK1.5 이전에는 에러

//        Integer i = list.get(0);
//        int i = list.get(0).intValue();
        int i = list.get(0);

    }
}
