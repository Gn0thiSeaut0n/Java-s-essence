public class InterfaceTest {
    public static void main(String[] args) {
        A a = new A();
        a.method(new C()); // A가 B를 사용(의존)
    }
}

interface I {
    public void method();
}


class A {
    public void method(I i) {
        i.method();
    }
}

class B implements I{
    public void method() {
        System.out.println("B 클래스의 메서드");
    }
}

class C implements I{
    public void method() {
        System.out.println("C 클래스의 메서드");
    }
}
