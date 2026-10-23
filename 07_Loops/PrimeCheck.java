// Java beginner example
public class PrimeCheck {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        boolean prime = n >= 2;
        for (int i = 2; i <= n / i && prime; i++) if (n % i == 0) prime = false;
        System.out.println(prime ? "Prime" : "Not prime");
        sc.close();
    }
}
