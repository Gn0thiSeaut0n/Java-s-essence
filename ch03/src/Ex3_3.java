public class Ex3_3 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result = mm.max(5, 3);
        long result1 = mm.add(5, 3);
        long result2 = mm.subtract(5L, 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        mm.printGugudan(3);

        System.out.println("max = " + result);
        System.out.println("add = " + result1);
        System.out.println("subtract = " + result1);
        System.out.println("multiply = " + result1);
        System.out.println("divide = " + result1);

    }
}

class MyMath {
    void printGugudan(int dan) {
        if (!(2 <= dan && dan <= 9)) {
            return;
        }
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
//        return; void는 생략 가능
    }

    long add(long a, long b) {
        return a + b;
    }

    long max(long a, long b) {
        return a > b ? a : b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}
