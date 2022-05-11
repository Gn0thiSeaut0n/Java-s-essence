import java.util.Arrays;

public class VarEx15_8 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 4, 3};
        int[][] arr2D = {{11, 12}, {21, 22}};

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr); // 내림차순
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr2D));

        String[][] str2D = {{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2d2 = {{"aaa", "bbb"}, {"AAA", "BBB"}};

        System.out.println(str2D.equals(str2d2));
        System.out.println(Arrays.deepEquals(str2D, str2d2));

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = Arrays.copyOf(arr, 7);
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println(Arrays.toString(arr4));

    }
}
