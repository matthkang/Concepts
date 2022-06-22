package stringconcepts;

public class ReverseString {
    public static void reverse(String s){
        char[] letters = s.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
    }


    public static void main(String[] args) {
        String str = "computer";
        reverse(str);
    }
}

