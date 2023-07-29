import string.ValidAnagram;

public class Main {
    public static void main(String[] args) {
        System.out.println("ValidAnagram");

        System.out.println("\ns = \"anagram\", t = \"nagaram\"");
        System.out.println(ValidAnagram.solutionArray("anagram", "nagaram"));
        System.out.println(ValidAnagram.solutionMap("anagram", "nagaram"));

        System.out.println("\ns = \"rat\", t = \"car\"");
        System.out.println(ValidAnagram.solutionArray("rat", "car"));
        System.out.println(ValidAnagram.solutionMap("rat", "car"));
    }
}