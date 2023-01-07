import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amountOfCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean isSuccessful = false;

        if (amountOfCups >= 10 && amountOfCups <= 25){
            if (amountOfCups <= 20 && !isWeekend) {
                isSuccessful = true;
            } else if (amountOfCups >= 15 && isWeekend) {
                isSuccessful = true;
            }
        }

       System.out.println(isSuccessful);
    }
}