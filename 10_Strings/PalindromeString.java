// Java beginner example
public class PalindromeString {
    public static void main(String[] args) {
        String s = "madam";
        String r = new StringBuilder(s).reverse().toString();
        System.out.println(s.equals(r) ? "Palindrome" : "Not palindrome");
    }
}
