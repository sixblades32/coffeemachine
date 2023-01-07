import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int busHeight = scanner.nextInt();
        int amountOfBridges = scanner.nextInt();
        boolean isSuccessful = true;

        for (int i = 0; i < amountOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();

            if (bridgeHeight <= busHeight) {
                System.out.println("Will crash on bridge " + (i + 1));
                isSuccessful = false;
                break;
            }
        }

        if (isSuccessful) System.out.println("Will not crash");

    }
}