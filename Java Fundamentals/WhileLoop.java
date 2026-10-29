
public class WhileLoop {

    public static void main(String[] args) {

        int i = 1;
        int sum = 0;

        while (i <= 10) {
            sum += i;
            i++;
        }

        System.out.println("Sum of numbers from 1 to 10: " + sum);

        int count = 5;

        while (count >= 1) {
            System.out.println(count);
            count--;
        }
    }
}
