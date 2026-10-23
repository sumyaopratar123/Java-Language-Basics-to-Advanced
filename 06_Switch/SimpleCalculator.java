// Java beginner example
public class SimpleCalculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        double a = sc.nextDouble();
        char op = sc.next().charAt(0);
        double b = sc.nextDouble();
        switch (op) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': if (b == 0) System.out.println("Cannot divide by zero"); else System.out.println(a / b); break;
            default: System.out.println("Invalid operator");
        }
        sc.close();
    }
}
