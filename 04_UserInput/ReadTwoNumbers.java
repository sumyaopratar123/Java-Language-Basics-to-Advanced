// Java beginner example
public class ReadTwoNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Sum = " + (a + b));
        sc.close();
    }
}
