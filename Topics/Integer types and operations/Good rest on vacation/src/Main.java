import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();

        int sum = days * scanner.nextInt() + scanner.nextInt() * 2 + (days - 1) * scanner.nextInt();

        System.out.println(sum);
    }
}