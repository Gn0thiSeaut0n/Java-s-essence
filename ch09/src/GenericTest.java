import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        ArrayList<Tv> list1 = new ArrayList<Tv>();
        list1.add(new Tv());
//        list1.add(new Audio());
//        Tv t = (Tv) list1.get(0);
        Tv t1 = list1.get(0);
    }
}

class Tv {

}

class Audio {

}