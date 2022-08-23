import java.util.Optional;

public class Ex11_11 {
    public static void main(String[] args) {
//        int[] arr = null;
        int[] arr = new int[0];
        System.out.println("arr.length = " + arr.length);

//        Optional<String> opt = null;
        Optional<String> opt = Optional.empty();
//        Optional<String> opt = Optional.of("abc");
        System.out.println("opt = " + opt);
//        System.out.println("opt = " + opt.get());

        String str = "";

//        try {
//            str = opt.get();
//        } catch (Exception e) {
//            str = "";
//        }

//        str = opt.orElse("EMPTY");
//        str = opt.orElseGet(() -> new String());
        str = opt.orElseGet(String::new);
        System.out.println("str = " + str);

    }
}
