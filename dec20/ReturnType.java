public class ReturnType {
    public static void main(String[] args) {
        // x and y are in the scope of the `main` method
        int x = 10;
        int y = 5;
        int z = add(x, y);
        System.out.println(z);
    }

    public static int add(int x, int y) {
        int sum = x + y; // x and y are in the scope of the `add` method
        return sum;
    }
}
