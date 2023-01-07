import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = new String[3];

        for (int i = 2; i >= 0; i--) {
            words[i] = scanner.next();
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}