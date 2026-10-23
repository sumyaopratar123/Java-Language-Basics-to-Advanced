// Java beginner example
public class ReverseNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        long n = sc.nextLong(), temp = Math.abs(n), rev = 0;
        while (temp > 0) { rev = rev * 10 + temp % 10; temp /= 10; }
        System.out.println(n < 0 ? -rev : rev);
        sc.close();
    }
}
