
public class ArrayFunctions {

    public static void update(int marks[], int nonchangeable) {
        nonchangeable = 10;
        for (int i = 0; i < marks.length; i++) {
            marks[i] += 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = {99, 98, 95};
        int nonchangeable = 5;
        update(marks, nonchangeable);
        System.out.println(nonchangeable);

        //print our updated marks
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
