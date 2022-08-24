import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11_13 {
    public static void main(String[] args) {
        String[] strArr = {
                "Inheritance", "Java", "Lamda", "stream", "OptionalDouble", "IntStream", "count", "sum"
        };

        Stream.of(strArr)
                .parallel()
                .forEachOrdered(System.out::println);

        boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
        Optional<String> sWord = Stream.of(strArr).parallel().filter(s -> s.charAt(0) == 's').findAny();

        System.out.println("noEmptyStr = " + noEmptyStr);
        System.out.println("sWord = " + sWord.get());

//        Stream<Integer> intStream1 = Stream.of(strArr).map(String::length);

        IntStream intSream1 = Stream.of(strArr).mapToInt(String::length);
        IntStream intSream2 = Stream.of(strArr).mapToInt(String::length);
        IntStream intSream3 = Stream.of(strArr).mapToInt(String::length);
        IntStream intSream4 = Stream.of(strArr).mapToInt(String::length);

        int count = intSream1.reduce(0, (a, b) -> a + 1);
        int sum = intSream2.reduce(0, (a, b) -> a + b);

        OptionalInt max = intSream3.reduce(Integer::max);
        OptionalInt min = intSream4.reduce(Integer::min);

        System.out.println("count = " + count);
        System.out.println("sum = " + sum);
        System.out.println("max = " + max.orElse(0));
        System.out.println("min = " + min.getAsInt());

    }
}
