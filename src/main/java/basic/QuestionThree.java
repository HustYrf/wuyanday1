package basic;

import java.util.Scanner;


public class QuestionThree {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入年份（例如：2012）");
        int year = s.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {//年份能被4整除但不能被100整除，或者年份能被400整除
            System.out.println(year + "年是闰年");
        } else {
            System.out.println(year + "年不是闰年");
        }
    }
}
