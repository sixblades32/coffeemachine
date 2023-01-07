import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int secondsInHour = 3600;
        int secondsInMin = 60;
        Scanner scanner = new Scanner(System.in);
        int firstHour = scanner.nextInt();
        int firstMin = scanner.nextInt();
        int firstSec = scanner.nextInt();
        int secondHour = scanner.nextInt();
        int secondMin = scanner.nextInt();
        int secondSec = scanner.nextInt();
        int hoursDiff = (secondHour - firstHour) * secondsInHour;
        int minDiff = (secondMin - firstMin) * secondsInMin;
        int secDiff = secondSec - firstSec;
        int result = hoursDiff + minDiff + secDiff;
        System.out.print(result);
    }
}
