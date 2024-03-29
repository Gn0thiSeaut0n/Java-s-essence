public class Ex3_5 {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2();
        System.out.println(mm.add(3, 3));
        System.out.println(mm.add(3L, 3));
        System.out.println(mm.add(3, 3L));

    }
}

class MyMath2 {
    int add(int a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a + b;
    }

    long add(int a, long b) {
        System.out.println("int add(int a, int b) - ");
        return a + b;
    }

    long add(long a, int b) {
        System.out.println("int add(int a, int b) - ");
        return a + b;
    }

    long add(long a, long b) {
        System.out.println("long add(long a, long b) - ");
        return a + b;
    }

    int add(int[] a) {
        System.out.println("int add(int[] a) - ");
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        return result;
    }
}
