public class TypePromotion {
    public static void main(String args[]){
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a); // chote waalon ko int bana deta hai

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        double ans = a + b + c + d;  // all values converted to double
        System.out.println(ans);
    }
}
