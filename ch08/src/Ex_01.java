import java.util.ArrayList;

public class Ex_01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1, 4));
        print(list1, list2);
    }
}
