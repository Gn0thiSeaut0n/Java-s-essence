public class FighterTest {
    public static void main(String[] args){
//        Fighter f = new Fighter();
//        FightTable f2 = f.getFightable();
//        Fighter f = new Fighter();
//        Unit2 f = new Fighter();
        FightTable f = new Fighter();
        f.move(100, 200);
        Fighter f2 = new Fighter();
        f.attack(f2);
//        f.stop();
    }
}

abstract class Unit2 {
    int x, y;

    abstract void move(int x, int y);
    void stop() {
        System.out.println("멈춥니다.");
    }
}

interface FightTable {
    void move(int x, int y);

    void attack(FightTable fightTable);
}

class Fighter extends Unit2 implements FightTable {
    public void move(int x, int y) {
        System.out.println("[" + x + ", " + y + "]로 이동");
    }

    public void attack(FightTable fightTable) {
        System.out.println(fightTable + "를 공격");
    }

    FightTable getFightable() {
        Fighter f = new Fighter();
        return f;
    }
}

