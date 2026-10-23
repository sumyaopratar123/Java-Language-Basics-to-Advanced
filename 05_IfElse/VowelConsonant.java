// Java beginner example
public class VowelConsonant {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        char ch = Character.toLowerCase(sc.next().charAt(0));
        if (!Character.isLetter(ch)) System.out.println("Not a letter");
        else System.out.println("aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant");
        sc.close();
    }
}
