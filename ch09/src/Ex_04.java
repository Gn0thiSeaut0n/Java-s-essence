import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Objects;

public class Ex_04 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();
//        FruitBox<Apple> appleFruitBox = new FruitBox<>(); 에러. 타입 불일치
//        FruitBox<Toy> toyBox = new FruitBox<Toy>(); 에러
        Box<Toy> toyBox2 = new Box<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
//        appleBox.add(new Grape());
        grapeBox.add(new Grape());

        System.out.println("fruitBox - " + fruitBox);
        System.out.println("appleBox - " + appleBox);
        System.out.println("grapeBox - " + grapeBox);

    }
}

class Fruit implements Eatable {
    public String toString () {
        return "Fruit";
    }
}

class Apple extends Fruit {
    public String toString () {
        return "Apple";
    }
}

class Grape extends Fruit {
    public String toString () {
        return "Grape";
    }
}

class Toy {
    public String toString() {
        return "Toy";
    }
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }
    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}


interface Eatable {}