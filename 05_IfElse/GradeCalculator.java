// Java beginner example
public class GradeCalculator {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) System.out.println("Invalid marks");
        else if (marks >= 90) System.out.println("A");
        else if (marks >= 75) System.out.println("B");
        else if (marks >= 60) System.out.println("C");
        else if (marks >= 40) System.out.println("D");
        else System.out.println("Fail");
        sc.close();
    }
}
