
import java.util.*;

public class continuestmnt {

    public static void main(String[] args) {
        // for (int i = 1; i <= 10; i++) {
        //     if (i == 3 || i == 9) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("enter a no : ");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was " + n);
        } while (true);
    }
}
