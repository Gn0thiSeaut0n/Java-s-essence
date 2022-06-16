public class Ex4_7 {
    public static void main(String[] args) {
    }
}

class Outer {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // 외부의 private에 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        //        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        final int lv = 0;
        final int LV = 0;

        class LocalInner { // 지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용 가능
            int liv = outerIv;
            int liv2 = outerCv;

            int liv3 = lv;
            int liv4 = LV;

            void method() {
                System.out.println(lv);
            }
        }

    }
}
