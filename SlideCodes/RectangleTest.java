public class RectangleTest {
    public static void main(String[] args) {

       /*
        Rectangle r1 = new Rectangle(3, 5);
        Rectangle r2 = new Rectangle(1, 4);
        Rectangle r3 = r1.biggerRectangle(r2);        //r1 is the caller;r1 is "this Rectangle"
        System.out.println("The larger area is " + r3.area());
  */

        Rectangle x = new Rectangle(3, 4);
        Rectangle y = new Rectangle(3, 4);
        Rectangle z = x;//z and x refer to the same Rectangle object
        System.out.println("x equals y: " + x.equals(y));
        System.out.println("x equals z: " + x.equals(z));

  String s = new String("Bingo!");
String t = new String("Bingo!");
System.out.println(s.equals(t));//returns true
System.out.println(s==t);//returns false
    }
}
