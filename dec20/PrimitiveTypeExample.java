

public class PrimitiveTypeExample {
    public static void main(String[] args) {
        // all decimal values are integers (3.0 is a integer AND decimal)
        // but not all integers are decimal values (3.5 is not an integer)
        //
        // Code ???
        double num1 = 3.7;
        double num2 = 2.1;
        int num3 = (int) (num1 - num2); // 3.7 - 2.1 == 1
        System.out.println(num3);
    }
}
