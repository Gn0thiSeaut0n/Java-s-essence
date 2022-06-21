public class Ex5_1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
//            System.out.println(0 / 0);
            System.out.println(args[0]);
            System.out.println(4);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("arithmeticException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(6);
    }
}
