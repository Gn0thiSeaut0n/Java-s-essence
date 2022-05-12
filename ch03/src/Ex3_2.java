public class Ex3_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;

        System.out.println("변경");

        t2 = t1;

        System.out.println(t1.channel);
        System.out.println(t2.channel);

    }
}
