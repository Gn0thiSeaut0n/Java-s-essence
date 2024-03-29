public class Ex6_1 {
    public static void main(String[] args) {
        Value value1 = new Value(10);
        Value value2 = new Value(10);

        if (value1.equals(value2))
            System.out.println("value1과 value2는 같습니다.");
        else
            System.out.println("value1과 value2는 다릅니다.");

    }
}

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    public boolean equals(Object object) {

        if(!(object instanceof Value))
            return false;

        Value value = (Value) object;
        return this.value == value.value;
    }
}