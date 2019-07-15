package evening2.java;

public class Game {

    public static final int JACK = 10;
    public static final int DAM = 12;
    public static final int KING = 15;
    public static final int ACE = 18;

    static final int SERVICE = 1;//Game version

    public static int calculator(int[] cards) {

        return JACK * cards[0] + DAM * cards[1] + KING * cards[2] + ACE * cards[3];
    }

    static void f() {
        System.out.println("Hello from Calculator");
    }

}
