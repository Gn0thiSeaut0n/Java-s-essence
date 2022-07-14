import java.util.ArrayList;
import java.util.Iterator;

public class Ex_05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        while (it.hasNext()) { // 실행 안 됨. 위에서 다 써서. 다시 얻어와야 나옴.
            Object obj = it.next();
            System.out.println(obj);
        }

        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }
}
