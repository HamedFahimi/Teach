public class SomeStringMethods1 {
    public static void main(String[] args) {
        String s1 = "Paul Deitel";
        System.out.println("length of s1 = " + s1.length());
        System.out.println("The character at index 8 : " + s1.charAt(8));
        System.out.println("The substring from position 2 to 6: " + s1.substring(2, 6));
        System.out.println(s1.equals("testing equality"));
        String s2 = "Angry";
        System.out.println(s2.concat("-Bird"));
        String s3 = String.format("Name is: %s", s1);
        String s4 = String.format("Value is %f", 14.4497);
        System.out.println(s3);
        System.out.println(s4);
        String s5 = "hello";
        System.out.print(s5.replace("l", "yy"));
    }
}
