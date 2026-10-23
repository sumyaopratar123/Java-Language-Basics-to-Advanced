// Java beginner example
public class SumFirstNNumbers {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = sc.nextInt();
        long sum = (long) n * (n + 1) / 2;
        System.out.println(sum);
        sc.close();
    }
}
