import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            if (i != size - 1) {
                array[i + 1] = scanner.nextInt();
            } else {
                array [0] = scanner.nextInt();
            }
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}