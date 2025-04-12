// This program demonstrates String parameters.
public class FormLetter {
    public static void main(String[] args) {
        letter("Philip", "Smith");
        letter("Jean", "Geges");
    }

    public static void letter(String first, String last) {
        System.out.println("Dear " + first + ",");
        System.out.println("Check out this amazing offer! 20%");
        System.out.println("off all items. A great deal, as");
        System.out.println("sure as your name is " + last + "!");
        System.out.println();
    }
}
