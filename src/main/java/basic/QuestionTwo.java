package basic;

import java.util.Scanner;


public class QuestionTwo {

    public static void main(String[] args) {
        String price = "请输入单件（￥）：";
        String num = "请输入数量：";
        String amount = "请输入金额（￥）：";
        Scanner scanner = new Scanner(System.in);
        System.out.printf("%s\n", price);
        double value = scanner.nextBigDecimal().doubleValue(); //单价
        System.out.printf("%s\n", num);
        int quantity = scanner.nextInt();//数量
        System.out.printf("%s\n", amount);
        double payment = scanner.nextBigDecimal().doubleValue();//收款
        printMess(value, quantity, payment);
    }

    public static void printMess(double value, int quantity, double payment) {
        if (value * quantity > payment) {
            System.out.println("输入信息有误！");
        } else {
            if (value * quantity >= 500) {
                System.out.printf("应收金额为：￥%f，找零为：￥%f\n", value * quantity * 0.8, payment - value * quantity * 0.8);
            } else {
                System.out.printf("应收金额为：￥%f，找零为：￥%f\n", value * quantity, payment - value * quantity);
            }

        }
    }


}
