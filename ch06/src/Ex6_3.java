import java.util.Objects;

public class Ex6_3 {
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
    }
}

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public boolean equals(Object object) {
        if(!(object instanceof Card))
            return false;
        Card c = (Card) object;
        return this.kind.equals(c.kind) && this.number == c.number;
    }

    public int hashCode() {
        return Objects.hash(kind, number);
    }

    public String toString() {
        return "kind: " + kind + ", number: " + number;
    }
}