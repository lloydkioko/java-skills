public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int stored = number;

        if (number < 0) {
            number *= -1;
            stored *= -1;
        }
        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }
        System.out.println("The reverse of the given number is: " + reverse);

        if (stored == reverse)
            return true;
        else
            return false;
    }
}
