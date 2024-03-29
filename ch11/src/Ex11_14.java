import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex11_14 {
    public static void main(String[] args) {
        Student2[] studArr = {
                new Student2("나자바", true, 1, 1, 300),
                new Student2("김지미", false, 1, 1, 250),
                new Student2("김자바", true, 1, 1, 200),
                new Student2("이지미", false, 1, 2, 150),
                new Student2("남자바", true, 1, 2, 50),
                new Student2("안지미", false, 1, 2, 100),
                new Student2("황지미", false, 1, 3, 150),
                new Student2("강지미", false, 1, 3, 300),
                new Student2("이자바", true, 1, 3, 250),
                new Student2("나자바", true, 2, 1, 200),
                new Student2("김지미", false, 2, 1, 150),
                new Student2("김자바", true, 2, 1, 100),
                new Student2("이지미", false, 2, 2, 50),
                new Student2("남자바", true, 2, 2, 300),
                new Student2("안지미", false, 2, 2, 100),
                new Student2("황지미", false, 2, 3, 150),
                new Student2("이자바", true, 2, 3, 200)
        };

        System.out.printf("1. 단순분할(성별로 분할) %n");
        Map<Boolean, List<Student2>> stuBySex = Stream.of(studArr)
                .collect(Collectors.partitioningBy(Student2::isMale));

        List<Student2> maleStudent = stuBySex.get(true);
        List<Student2> femaleStudent = stuBySex.get(false);

        for(Student2 s : maleStudent) System.out.println(s);
        for(Student2 f : femaleStudent) System.out.println(f);

        System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
        Map<Boolean, Long> stuNumBySex = Stream.of(studArr)
                .collect(Collectors.partitioningBy(Student2::isMale, Collectors.counting()));

        System.out.println("남학생 수 : " + stuNumBySex.get(true));
        System.out.println("여학생 수 : " + stuNumBySex.get(false));

        System.out.printf("%n3. 단순분할 +통계(성별 1등)%n");
        Map<Boolean, Optional<Student2>> topScoreBySex = Stream.of(studArr)
                .collect(Collectors.partitioningBy(Student2::isMale, Collectors.maxBy(Comparator.comparingInt(Student2::getScore))));

        System.out.println("남학생 1등 : " + topScoreBySex.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex.get(false));

        Map<Boolean, Student2> topScoreBySex2 = Stream.of(studArr)
                .collect(Collectors.partitioningBy(Student2::isMale, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student2::getScore)), Optional::get)));

        System.out.println("남학생 1등 : " + topScoreBySex2.get(true));
        System.out.println("여학생 1등 : " + topScoreBySex2.get(false));

        System.out.printf("%n4. 다중분할(성별 불합격자, 100이하)%n");
        Map<Boolean, Map<Boolean, List<Student2>>> failedBySex = Stream.of(studArr)
                .collect(Collectors.partitioningBy(Student2::isMale, Collectors.partitioningBy(s -> s.getScore() <= 100)));
        List<Student2> failedMaleStu = failedBySex.get(true).get(true);
        List<Student2> failedFemaleStu = failedBySex.get(false).get(true);

        for(Student2 s : failedMaleStu) System.out.println(s);
        for(Student2 f : failedFemaleStu) System.out.println(f);
    }
}

class Student2 {
    String name;
    boolean isMale;
    int hak;
    int ban;
    int score;

    Student2(String name, boolean isMale, int hak, int ban, int score) {
        this.name = name;
        this.isMale = isMale;
        this.hak = hak;
        this.ban = ban;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public boolean isMale() {
        return isMale;
    }

    public int getHak() {
        return hak;
    }

    public int getBan() {
        return ban;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", isMale=" + isMale +
                ", hak=" + hak +
                ", ban=" + ban +
                ", score=" + score +
                '}';
    }

    enum Level {HIGH, MID, LOW}

}

