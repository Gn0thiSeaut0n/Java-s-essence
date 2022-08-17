import java.util.function.Function;
import java.util.function.Supplier;

public class Ex11_0 {
    public static void main(String[] args) {
//        Object obj = (a, b) -> a > b ? a : b;
//        MyFunction1 f = new MyFunction1() {
//            public int max(int a, int b){
//                return a > b ? a : b;
//            }
//        };

        // 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
        MyFunction1 f = (a, b) -> a > b ? a : b;

        int value = f.max(3, 5); // 에러, 함수형 인터페이스
        System.out.println(value);

//        Function<String, Integer> func = (String s) -> Integer.parseInt(s);
        Function<String, Integer> func = Integer::parseInt;
        System.out.println(func.apply("100") + 200);

//        Supplier<MyClass> s = () -> new MyClass();
        Supplier<MyClass> s = MyClass::new;
        System.out.println(s.get());

        Function<Integer, int[]> funcs = (i) -> new int[i];
        System.out.println(funcs.apply(100).length);
    }
}

@FunctionalInterface // 안 써도 되지만 추상메서드가 두 개 이상이면 에러가 나도록 달아줌
interface MyFunction1{
    int max(int a, int b);
}

class MyClass{
    int iv;

    MyClass(){}

    MyClass(int iv) {
        this.iv = iv;
    }
}