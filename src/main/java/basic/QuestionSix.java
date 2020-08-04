package basic;


public class QuestionSix {
    public static void main(String[] args) {
        long sum = 0;
        long result = 1;
        for (int i = 1; i <= 10; i++) {
            result = result * 10;
            sum = sum + result - 1;
        }
        System.out.println("9+99+999+...+999999999=" + sum);
    }
}
