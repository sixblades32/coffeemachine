import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = scanner.nextInt();
        String shape = "";

        switch (number) {
            case 1:
                shape = "square";
                break;
            case 2:
                shape = "circle";
                break;
            case 3:
                shape = "triangle";
                break;
            case 4:
                shape = "rhombus";
                break;
            default:
                System.out.println("There is no such shape!");
                break;
        }

        if (!shape.isEmpty()) {
            System.out.println("You have chosen a " + shape);
        }
    }
}