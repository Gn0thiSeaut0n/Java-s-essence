import java.util.Arrays;

public class VarEx15_5 {
    public static void main(String[] args) {
        String[] strArr = {"가위", "바위", "보"};
        System.out.println(Arrays.toString(strArr));

        for (int i = 0; i < 10; i++) {
            System.out.println(strArr[(int) (Math.random() * 3)]);
        }
    }
}
