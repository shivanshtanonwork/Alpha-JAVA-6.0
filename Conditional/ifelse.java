
public class ifelse {

    public static void main(String[] args) {
        int age = 26;
        if (age > 18) {
            System.out.println("adult: drive, vote");
        }
        if (age > 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("not adult");
        }
    }
}
