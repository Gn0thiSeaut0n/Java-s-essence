package pkg2;

import pkg1.MyParent;

public class MyParentTest2 {
    public static void main(String[] args) {
        MyChild c = new MyChild();
//        System.out.println(c.prv); 에러
//        System.out.println(c.dft); 에러
//        System.out.println(c.prt);  에러
        System.out.println(c.pub); // OK
    }
}

class MyChild extends MyParent {
    public void printMembers() {
//        System.out.println(prv); 에러
//        System.out.println(dft); 에러
        System.out.println(prt); // OK
        System.out.println(pub); // OK
    }
}
