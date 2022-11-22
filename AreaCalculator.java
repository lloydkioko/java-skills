public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0)
            return -1;
        else
            return Math.PI * radius * radius;
    }

    public static double area(double base, double height) {
        if (base < 0 || height < 0)
            return -1;
        else
            return base * height;
    }
}
