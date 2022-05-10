import java.util.Arrays;

public class VarEx15_1 {
    public static void main(String[] args) {
        int[] score = new int[5];
        score[3] = 100;

        System.out.println(score[3]);

        for (int i = 0; i < score.length; i++) {
            System.out.println("score[" + i + "]" + score[i]);
        }
        System.out.println(Arrays.toString(score));
    }
}
