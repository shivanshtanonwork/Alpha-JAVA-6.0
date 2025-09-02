
public class reverseNo {

    public static void main(String[] args) {
        int n = 10899;

        // while (n > 0) {
        //     int lastDigit = n % 10; // getting last digit remainder
        //     System.out.print(lastDigit);
        //     n = n / 10; // removing last digit
        // }
        // System.out.println();
        int rev = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n /= 10;
        }
        System.out.println(rev);
    }
}
