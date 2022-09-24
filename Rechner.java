public class Rechner {



    public static void main(String[] args) {
        int a = 15;
        int b = 8;
        double result = 0.0;
        char operand = '+';

       /* result = a + b;
        System.out.println(a + " + " + b + " = " + result);
        result = a - b;
        System.out.println(a + " - " + b + " = " + result);
        result = a * b;
        System.out.println(a + " * " + b + " = " + result);
        result = a / b;
        System.out.println(a + " / " + b + " = " + result);
        result = a % b;
        System.out.println(a + " % " + b + " = " + result);
        */
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                operand = '+';
            } else if (i == 1) {
                operand = '-';
            } else if (i == 2) {
                operand = '*';
            } else if (i == 3) {
                operand = '/';
            } else if (i == 4) {
                operand = '%';
            }
            result = maths(a, b, operand);
            System.out.println(result);
        }
    }


    private static double maths(int a, int b, char operand) {
        double result = 0.0;

        if (operand == '+') {
            result = a + b;
        } else if (operand == '-') {
            result = a - b;
        } else if (operand == '*') {
            result = a * b;
        } else if (operand == '/') {
            result = a / (1.0 * b);
        } else if (operand == '%') {
            result = a % b;
        } else {
            System.out.println("Nicht erkanntes Zeichen !");
        }
        return result;
    }
}
