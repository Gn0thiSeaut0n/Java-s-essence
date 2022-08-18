import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex11_7 {
    public static void main(String[] args) {
//        IntStream intStream = new Random().ints(); // 무한스트림
//        IntStream intStream = new Random().ints(10, 5, 10);
//        intStream.limit(5).forEach(System.out::println);

        Stream<Integer> intStream = Stream.iterate(1, n -> n + 2);
        intStream.limit(10).forEach(System.out::println);
        Stream<Integer> oneStream = Stream.generate(() -> 1);
        oneStream.limit(10).forEach(System.out::println);

    }
}
