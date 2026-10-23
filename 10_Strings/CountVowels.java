// Java beginner example
public class CountVowels {
    public static void main(String[] args) {
        String s = "programming".toLowerCase();
        int count = 0;
        for (char c : s.toCharArray()) if ("aeiou".indexOf(c) >= 0) count++;
        System.out.println(count);
    }
}
