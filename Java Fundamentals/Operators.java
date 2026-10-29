
public class Operators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        // Arithmetic Operators
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a == b: " + (a == b));

        // Logical Operators
        System.out.println("Logical AND: " + (a > 5 && b < 5));
        System.out.println("Logical OR: " + (a < 5 || b < 5));

        // Assignment Operator
        a += 5;
        System.out.println("Updated a: " + a);

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
