import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        String operator = scanner.next();
        long second = scanner.nextLong();

        if (operator.equals("/") && second == 0) {
            System.out.println("Division by 0!");
        } else {
            switch (operator) {
                case "+":
                    System.out.println(first + second);
                    break;
                case "-":
                    System.out.println(first - second);
                    break;
                case "/":
                    System.out.println(first / second);
                    break;
                case "*":
                    System.out.println(first * second);
                    break;
                default:
                    System.out.println("Unknown operator");
                    break;
            }
        }

    }
}