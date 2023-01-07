import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int deficiencyHours = scanner.nextInt();
        int excessHours = scanner.nextInt();
        int actuallyHours = scanner.nextInt();

        if (actuallyHours < deficiencyHours) {
            System.out.println("Deficiency");
        } else if (actuallyHours > excessHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}