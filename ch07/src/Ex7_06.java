import java.text.DecimalFormat;

public class Ex7_06 {
    public static void main(String[] args) {

        DecimalFormat df1 = new DecimalFormat("#,###.##");
        DecimalFormat df2 = new DecimalFormat("#.###E0");

        try {
            System.out.println(Double.parseDouble("1234567.89"));
            Number num = df1.parse("1,234,567.89");
            System.out.print("1,234,567.89" + " -> ");

            double d = num.doubleValue();
            System.out.print(d + " -> ");
            System.out.println(df2.format(num));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
