package problems;

public class CheckingAnagram {
    public static void main(String[] args) {
        String a = "liisten";
        String b = "siilent";

        if (a.length() != b.length()) {
            System.out.println("Not Anagram");
            System.exit(0);
        }

        boolean[] used = new boolean[b.length()];
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j) && !used[j]) {
                    used[j] = true;
                    count++;
                    break;
                }
            }
        }

        if (count == a.length()) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
