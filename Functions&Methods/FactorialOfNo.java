
public class FactorialOfNo {

    public static int factorial(int n) {
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f; // factorial
    }

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // public static boolean isPrime(int n) {
    //     boolean isPrime = true;
    //     for (int i = 2; i <= n - 1; i++) {
    //         if (n % i == 0) {
    //             isPrime = false;
    //             break;
    //         }
    //     }
    //     return isPrime;
    // }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrimeinRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int fact = factorial(4);
        // System.out.println(fact);
        // System.out.println(binCoeff(5, 2));
        // System.out.println(sum(1, 2));
        // System.out.println(sum(4.5f, 5.2f));
        // System.out.println(isPrime(12));
        PrimeinRange(20);
    }
}
