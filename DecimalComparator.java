public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {

        if (+a == +b)
            return true;
        else {
            String string1 = a + "";
            String string2 = b + "";

            if (string1.substring(0, 5) != string2.substring(0, 5)) {
                return false;
            }
            return true;
        }
    }
}
