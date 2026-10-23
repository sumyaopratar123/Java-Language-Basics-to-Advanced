// Java beginner example
public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {5, 8, 2, 9, 1};
        int target = 9, index = -1;
        for (int i = 0; i < a.length; i++) if (a[i] == target) { index = i; break; }
        System.out.println(index);
    }
}
