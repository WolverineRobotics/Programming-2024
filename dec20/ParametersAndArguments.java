
public class ParametersAndArguments {
    public static void main(String[] args) {
        int abc = 3; // argument
        printStuff(abc); // 3

        int def = 4;
        printStuff(def); // 4
    }

    public static void printStuff(int x) { // parameters
        System.out.println(x);
    }
}
