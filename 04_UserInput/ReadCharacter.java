// Java beginner example
public class ReadCharacter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        sc.close();
    }
}
