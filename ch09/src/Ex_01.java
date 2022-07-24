import java.util.ArrayList;
import java.util.List;

public class Ex_01 {
    public static void main(String[] args) {

        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv1> tvList = new ArrayList<Tv1>();
//        ArrayList<Product> tvList = new ArrayList<Tv1>(); // 에러
//        List<Tv1> tvList = new ArrayList<Tv1>(); // OK. 다형성

        productList.add(new Tv1());
        productList.add(new Audio1());

        tvList.add(new Tv1());
        tvList.add(new Tv1());

        printAll(productList);
    }

    public static void printAll(ArrayList<Product> list) {
        for (Product p : list) {
            System.out.println(p);
        }
    }
}

class Product {

}

class Tv1 extends Product {

}

class Audio1 extends Product {

}
