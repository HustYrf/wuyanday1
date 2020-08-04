package basic;


public class QuestionEleven {
    public static void main(String[] args) {
        int i = 1;
        StringBuilder sb = new StringBuilder();
        for (char c = '\u4e00'; c <= '\u9fa5'; c++, i++) {
            sb.append(c);
            if (i % 50 == 0) {
                sb.append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}
