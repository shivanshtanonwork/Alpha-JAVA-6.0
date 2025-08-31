
import java.util.*;

public class largestof3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of A");
        int A = sc.nextInt();
        System.out.println("Enter Value of B");
        int B = sc.nextInt();
        System.out.println("Enter Value of C");
        int C = sc.nextInt();

        if (A >= B && A >= C) {
            System.out.println("A is greater :" + A);
        } else if (B >= C) {
            System.out.println("B is greater :" + B);
        } else {
            System.out.println("C is greater : " + C);
        }
    }
}
