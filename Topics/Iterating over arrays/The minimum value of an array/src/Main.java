import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int min = array[0];

        for (int number : array) {
            if (min > number) {
                min = number;
            }
        }

        System.out.println(min);
    }
}