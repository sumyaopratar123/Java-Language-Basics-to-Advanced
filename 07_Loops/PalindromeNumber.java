// Java beginner example
public class PalindromeNumber {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt(), temp = n, rev = 0;
        while (temp > 0) { rev = rev * 10 + temp % 10; temp /= 10; }
        System.out.println(n >= 0 && n == rev ? "Palindrome" : "Not palindrome");
        sc.close();
    }
}
