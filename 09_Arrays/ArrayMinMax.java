// Java beginner example
public class ArrayMinMax {
    public static void main(String[] args) {
        int[] a = {12, 4, 19, 2, 8};
        int min = a[0], max = a[0];
        for (int x : a) { if (x < min) min = x; if (x > max) max = x; }
        System.out.println("Min=" + min + ", Max=" + max);
    }
}
