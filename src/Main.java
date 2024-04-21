public class Main {
    public static void main(String[] args) {
        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1); // 1 - 1 = 0.
//        int c = calculator.divide.apply(a, b); // 3 / 0. Division by zero.
//        Need to catch error "java.lang.ArithmeticException: / by zero".

        try {
            int c = calculator.divide.apply(a, b);
            calculator.println.accept(c);
        } catch (ArithmeticException exception) {
            System.out.println("Exception handling of " + exception);
        } finally {
            System.out.println("The program has stopped.");
        }
    }
}