// Java beginner example
public class CountDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = Math.abs(sc.nextLong());
        int count = n == 0 ? 1 : 0;
        while (n > 0) { count++; n /= 10; }
        System.out.println(count);
        sc.close();
    }
}
