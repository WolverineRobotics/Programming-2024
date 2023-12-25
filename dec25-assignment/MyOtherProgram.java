public class MyOtherProgram {

    public static int add(int a, int b) {
        int ans = a + b;
        return ans;
    }

    public static int multiply(int a, int b) {
        int ans = a * b;
        return ans;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 6;
        int z = 5;
        int w = add(x, multiply(y, z));
        System.out.println(w);
    }
}
