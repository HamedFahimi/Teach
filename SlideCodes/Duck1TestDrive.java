public class Duck1TestDrive {
   public static void main(String[] args) {
      Duck1 MyDuck = new Duck1();
      MyDuck.quack();
      System.out.println("The name of MyDuck = " + MyDuck.name);
      MyDuck.size = 40;
      System.out.print("The size of MyDuck = " + MyDuck.size);
   }
}

