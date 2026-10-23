// Java beginner example
public class ReadName {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
        sc.close();
    }
}
