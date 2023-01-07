import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        int s = scanner.nextInt();
        int t = scanner.nextInt();

        int sumFS = f + s;
        int sumST = s + t;
        int sumTF = t + f;

        System.out.println((sumFS > t) && (sumST > f) && (sumTF > s) ? "YES" : "NO");
    }
}