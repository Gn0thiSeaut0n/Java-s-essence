public class Ex5_2 {
    public static void main(String[] args) {
        try {
            throw new Exception(); // checked
        } catch (Exception e) {
            System.out.println("에러");
        }

        throw new RuntimeException(); // unchecked
    }
}
