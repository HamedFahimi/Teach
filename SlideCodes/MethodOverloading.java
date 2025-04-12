public class MethodOverloading {

    // test overloaded square methods
    public static void main(String[] args)
    {
        int s = 7;
        double t = 7.5;
        System.out.printf("Square of integer %d is %d%n", s, square(s));
        System.out.printf("Square of double %f is %f%n", t, square(t));
    }

    // square method with int argument
    public static int square(int intValue)
    {
        System.out.printf("%nCalled square with int argument: %d%n",
                intValue);
        return intValue * intValue;
    }

    // square method with double argument
    public static double square(double doubleValue)
    {
        System.out.printf("%nCalled square with double argument: %f%n",
                doubleValue);
        return doubleValue * doubleValue;
    }
} // end class MethodOverload
