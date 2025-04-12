public class ArrayInitializationToDefaultValues {
    public static void main(String[] args) {
        double[] x = new double[10];
        System.out.println("Elements of an array of double type automatically get initialized to 0.0.");
        for (int i = 0; i < 10; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        System.out.println();
        boolean y[] = new boolean[10];
        System.out.println("Elements of an array of boolean type automatically get initialized to false.");
        for (int i = 0; i < 10; i++) {
            System.out.println("x[" + i + "] = " + y[i]);
        }
    }
}
