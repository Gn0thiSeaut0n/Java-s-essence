import java.util.Scanner;

public class VarEx13_2 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.println("숫자를 입력하세요.(예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp);

        while (num != 0) {
            sum += num % 10;
            System.out.printf("sum=%3d num=%d%n", sum, num);

            num /= 10;
        }
        System.out.println("각 자리 수의 합: "+sum);
    }
}
