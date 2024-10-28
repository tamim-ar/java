package problems;

public class FindNonRepeatingString {
    public static void main(String[] args) {
        String a = "geekforgeeks";

        for (int i = 0; i < a.length(); i++) {
            boolean found = false;
            for (int j = 0; j < a.length(); ++j) {
                if(i != j && a.charAt(i) == a.charAt(j)){
                    found = true;
                }
            }
            if (!found){
                System.out.println(a.charAt(i));
                break;
            }
        }
    }
}
