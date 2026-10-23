// Java beginner example
public class SumOfDigits {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = Math.abs(sc.nextLong()), sum = 0;
        while (n > 0) { sum += n % 10; n /= 10; }
        System.out.println(sum);
        sc.close();
    }
}
