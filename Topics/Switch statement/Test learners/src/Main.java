import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Yes!");
        } else if(choice >= 2 && choice <= 4) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }


    }
}