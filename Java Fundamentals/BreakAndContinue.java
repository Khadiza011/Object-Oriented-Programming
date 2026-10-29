
public class BreakAndContinue {

    public static void main(String[] args) {

        System.out.println("Example of break:");

        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.print(i + " ");
        }

        System.out.println("\n\nExample of continue:");

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.print(i + " ");
        }

        System.out.println();
    }
}
