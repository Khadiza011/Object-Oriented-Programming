
public class DoWhileLoop {

    public static void main(String[] args) {

        int i = 1;

        // Print numbers from 1 to 5
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);

        // Example: Executes at least once
        int number = 10;

        do {
            System.out.println("This executes once.");
            number++;
        } while (number < 5);
    }
}
