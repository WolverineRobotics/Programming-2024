public class Operators {
    public static void main(String[] args) {
        // NOT OPERATOR ![variable name]
        boolean x = true;
        boolean y = !x; // y == false
        // System.out.println(y);

        // EQUAL OPERATOR [variable 1] == [variable 2]
        int a = 30;
        int b = 1;
        boolean c = (a == b); // 30 == 1, c == false
        System.out.println(c);

        // INEQUALITY OPERATORS [variable 1] [>, <, <=, >=] [variable 2]
        int p = 29;
        int q = 45;
        boolean d = p < q; // d == (29 < 45) == true
        
        // THE TERNARY OPERATOR [condition] ? [returns true case] : [returns false case]
        // int z = d ? 1 : 2;
        int z = (p == q) ? 100 : 200;
        System.out.println(z);
    }
}
