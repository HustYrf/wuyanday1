package basic;

import java.util.Scanner;


public class QuestionFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择功能：1.显示全部记录 2.查询登陆记录 0.退出");
        int inputNum = scanner.nextInt();
        method(inputNum);

    }

    public static void method(int inputNum) {
        if (inputNum < 0 || inputNum > 2) {
            System.out.println("输入错误");
            return;
        }
        switch (inputNum) {
            case (0):
                System.out.println("欢迎使用");
                break;
            case (1):
                System.out.println("显示全部记录");
                break;
            case (2):
                System.out.println("查询登陆记录");
                break;
        }
    }
}


