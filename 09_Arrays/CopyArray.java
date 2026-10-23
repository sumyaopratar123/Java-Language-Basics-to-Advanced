// Java beginner example
public class CopyArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = java.util.Arrays.copyOf(a, a.length);
        System.out.println(java.util.Arrays.toString(b));
    }
}
