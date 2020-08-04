package basic;

import java.util.Scanner;


public class QuestionFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入该学员的分数(0-100):");
        int grade = scanner.nextInt();
        gradeInterval(grade);
    }

    public static void gradeInterval(int grade) {
        if (grade < 0 || grade > 100) {
            System.out.println("请输入0到100以内的分数");
        } else {
            if (grade < 60) {
                System.out.println("D");
            } else if (grade < 80) {
                System.out.println("C");
            } else if (grade < 90) {
                System.out.println("B");
            } else {
                System.out.println("A");
            }
        }
    }
}
