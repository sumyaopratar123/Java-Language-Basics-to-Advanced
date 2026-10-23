// Java beginner example
public class LeapYear {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int y = sc.nextInt();
        boolean leap = y % 400 == 0 || (y % 4 == 0 && y % 100 != 0);
        System.out.println(leap ? "Leap year" : "Not leap year");
        sc.close();
    }
}
