public class SomeStringMethods2 {
    public static void main(String[] args) {
        String str1 = "GANDALF THE GRAY";
        System.out.println("Index of E in str2 = " + str1.indexOf("E"));
        str1.toLowerCase();
        System.out.println("str1 = " + str1);
        System.out.println("Therefore, str1 itself was not modified!");
        String str2 = str1.toLowerCase();
        System.out.println("str2 = " + str2);
        if (str2.startsWith("gan"))
            System.out.print("Yes");
    }
}

