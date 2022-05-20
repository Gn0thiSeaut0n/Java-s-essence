public class Ex3_8 {
    public static void main(String[] args) {
        System.out.println(InitTest.test);
    }
}

class InitTest {
    static int cv = 1, test = 2;
    int iv = 1;

    static {
        cv = 2;
        test = 1;
        System.out.println("cv: " + cv + ", test: " + test);
    }

    static {
        test = 5;
        System.out.println("cv: " + cv + ", test: " + test);
    }

    {
        iv = 2;
//        System.out.println("cv: " + cv + ", test: " + test + ", iv: " + iv);
    }

    InitTest() {
        iv = 3;
//        System.out.println("cv: " + cv + ", test: " + test + ", iv: " + iv);
    }
}
