import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11_6 {
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
//        Stream<Integer> intStream = list.stream();
//        intStream.forEach(System.out::print); // forEach() 최종연산
//
//        // stream은 1회용. 최종연산 수행 시, stream 닫힘.
//        intStream = list.stream();
//        intStream.forEach(System.out::print);

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        int[] intArr = {1, 2, 3, 4, 5};
        IntStream intStream = Arrays.stream(intArr);
        intStream.forEach(System.out::println);
        System.out.println("count = " + intStream.count());
        System.out.println("sum = " + intStream.sum());
        System.out.println("average = " + intStream.average());

//        Integer[] intArr = {1, 2, 3, 4, 5};
//        Stream<Integer> intStream = Arrays.stream(intArr);
//        System.out.println("count = " + intStream.count());

    }
}
