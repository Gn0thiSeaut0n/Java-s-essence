public class VarEx3 {
    public static void main(String[] args) {
        final int score = 100;
//        score = 200;

        boolean power = false;

        byte b = 127; // -128~127

        int oct = 010; //8진수, 10진수로 8
        int hex = 0x10; //16진수, 10진수로 16

        long l = 10_000_000_000L;

        float f = 3.14f;
        double d = 3.14d; // d 생략 가능
        
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);

        char ch = 'A';
        int i = 'A';

        System.out.println(ch);
        System.out.println(i);

        String str = ""; // 빈 문자열(empty string)
        String str2 = "ABCD";
        String str3 = "123";
        String str4 = str2 + str3;

        System.out.println(str4);
        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "");
    }
}
