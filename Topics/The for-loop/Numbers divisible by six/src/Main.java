import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < length; i++) {
            int n = scanner.nextInt();
            if (n % 6 == 0) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}