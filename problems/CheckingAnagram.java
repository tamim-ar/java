package problems;

public class CheckingAnagram {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silext";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                } else {
                    System.out.println("Not Anagram");
                    System.exit(0);
                }
            }
        }
        System.out.println("Anagram");
    }
}