public class Ex11_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
//        MyFunction f = new MyFunction() {
//            public int max(int a, int b){
//                return a > b ? a : b;
//            }
//        };

        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5); // 에러, 함수형 인터페이스
        System.out.println(value);
    }
}

@FunctionalInterface // 안 써도 되지만 추상메서드가 두 개 이상이면 에러가 나도록 달아줌
interface MyFunction{
    int max(int a, int b);
}