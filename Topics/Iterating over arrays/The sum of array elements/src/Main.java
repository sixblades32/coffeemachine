import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[scanner.nextInt()];

        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;

        for(int digit : array){
            sum += digit;
        }

        System.out.println(sum);
    }
}