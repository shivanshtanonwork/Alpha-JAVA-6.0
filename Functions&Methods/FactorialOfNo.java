
public class FactorialOfNo {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial
    }

    public static void main(String[] args) {
        int fact = factorial(4);
        System.out.println(fact);
    }
}
