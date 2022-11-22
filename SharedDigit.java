public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {

        if ((a < 10 || a > 99) || (b < 10 || b > 99))
            return false;

        int firstValueA = a % 10;
        int firstValueB = b % 10;
        int secondValueA = a / 10;
        int secondValueB = b / 10;

        if (firstValueA == firstValueB || secondValueA == secondValueB||firstValueA==secondValueB)
            return true;
        else
            return false;
    }
}
