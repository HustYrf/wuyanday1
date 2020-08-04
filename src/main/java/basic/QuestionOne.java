package basic;

import java.util.Scanner;


public class QuestionOne {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()){
            System.out.println(isEighteenAndFifty(Integer.valueOf(scanner.next())));
        }
    }

    //判断数字是否在18-50之间
    public static boolean isEighteenAndFifty(int num) {
        return num >= 18 && num <= 50 ? true : false;
    }
}
