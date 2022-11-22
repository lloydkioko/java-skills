import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int count = 1;
        int sum = 0;
        int avg = 0;
        while (true) {
            boolean isInteger = scanner.hasNextInt();
            if (isInteger) {
                int input = scanner.nextInt();

                sum += input;
                avg = (int) Math.round((double) sum / count);
            } else
                break;
            count++;

        }
        System.out.println("SUM = " + sum + " AVG = " + avg);

        scanner.close();
    }
}
