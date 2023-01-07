package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final int DEFAULT_MONEY = 550;
    private static final int DEFAULT_WATER = 400;
    private static final int DEFAULT_MILK = 540;
    private static final int DEFAULT_BEANS = 120;
    private static final int DEFAULT_CUPS = 9;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Machine MACHINE = new Machine(DEFAULT_WATER, DEFAULT_MILK, DEFAULT_BEANS, DEFAULT_CUPS, DEFAULT_MONEY);

    public static void main(String[] args) {

        while (MACHINE.isWorking()) {
            MACHINE.execute(SCANNER.next());
        }
    }
}
