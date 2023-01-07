import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int sum = 0;

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int number : array) {
            if (number > n) {
                sum += number;
            }
        }

        System.out.println(sum);

    }
}