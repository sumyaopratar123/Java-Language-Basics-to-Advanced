// Java beginner example
public class EligibleToVote {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Eligible" : "Not eligible");
        sc.close();
    }
}
