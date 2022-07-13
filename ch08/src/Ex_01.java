import java.util.ArrayList;
import java.util.Collections;

public class Ex_01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));
        System.out.println();

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        list1.add(0, "1");
        print(list1, list2);

        System.out.println("index = " + list1.indexOf(1));
        System.out.println();

        list1.remove(1);
        list1.remove(new Integer(1));
        print(list1, list2);

        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        System.out.println();

        for (int i = list2.size() - 1; i > 0; i--) {
            if (list1.contains(list2.get(0))) {
                list2.remove(i);
            }
        }
        print(list1, list2);
    }

    static void print(ArrayList a, ArrayList b) {
        System.out.println("list1 : " + a);
        System.out.println("list2 : " + b);
        System.out.println();
    }
}
