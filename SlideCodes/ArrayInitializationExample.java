public class ArrayInitializationExample {
    public static void main(String[] args) {

        int[] squares1 = {0, 1, 4, 9, 16, 25, 36, 49, 64, 81, 100};
        for (int i = 0; i < 11; i++) {
            System.out.println("squares1[" + i + "] = " + squares1[i]);
        }
        System.out.println();
        int[] squares2 = new int[11];
        for (int i = 0; i < 11; i++) {
            squares2[i] = i * i;
        }

        for (int i = 0; i < 11; i++) {
            System.out.println("squares2[" + i + "] = " + squares2[i]);
        }
    }
}
