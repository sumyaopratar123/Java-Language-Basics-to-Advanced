// Java beginner example
public class FibonacciSeries {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        long a = 0, b = 1;
        for (int i = 0; i < n; i++) { System.out.print(a + " "); long c = a + b; a = b; b = c; }
        System.out.println();
        sc.close();
    }
}
