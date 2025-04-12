public class MathSampleMethods {
    public static void main(String[] args) {
        double a = 900.0;
        System.out.println("square root of " + a + " = " + Math.sqrt(a));
        double b = 2.0;
        System.out.println("exponential of " + b + " = " + Math.exp(b));
        double c = 1.0;
        System.out.println("ln of " + c + " = " + Math.log(c));
        double d = 3.56; double e = 4.72;
        System.out.println("maximum of " + d + " and " + e + " = " + Math.max(d, e));
        int f = 23; int g = 14;
        System.out.println("minimum of " + f + " and " + g + " = " + Math.min(f, g));
        double h = 3.0; double i = 5.0;
        System.out.println(h + " to the power of " + i + " = " + Math.pow(h, i));
        System.out.println("a random number generated within [0, 1] = " + Math.random());
        double j = 19.42;
        System.out.println("ceiling of " + j + " = " + Math.ceil(j));
        double k = -17.3;
        System.out.println("floor of " + k + " = " + Math.floor(k));
        double l = 45.0;
        double m = Math.toRadians(l);
        System.out.println("l to radians is = " + m);
        double n = Math.sin(m);
        System.out.println("sin(" + l + ") = " + n);
        double o = Math.cos(m);
        System.out.println("cos(" + l + ") = " + o);
        double p = Math.tan(m);
        System.out.println("tan(" + l + ") = " + p);
        double q = -4.65;
        System.out.println("absolute value of " + q + " = " + Math.abs(q));
    }
}

