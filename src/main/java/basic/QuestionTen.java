package basic;


public class QuestionTen {
    String str;

    public QuestionTen(String s) {
        this.str = s;
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.trim().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //todo
    }
}
