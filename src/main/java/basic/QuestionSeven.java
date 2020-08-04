package basic;

import java.util.Random;
import java.util.Scanner;


public class QuestionSeven {
//    public static void main(String[] args) {//while
//        int max = 1000;
//        int min = 1;
//        Random random = new Random();
//        int randomNum = random.nextInt(max) % (max - min + 1) + min;
////        System.out.println(randomNum);
//        while (true) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("请输入你猜测的数字（1-1000）,退出请按0：");
//            int i = scanner.nextInt();
//            if (i == 0) {
//                System.out.println("真遗憾，下次再挑战吧！");
//                break;
//            }
//            if (i > randomNum) {
//                System.out.println("太大了");
//            } else if (i < randomNum) {
//                System.out.println("太小了");
//            } else {
//                System.out.println("恭喜，你猜对了！");
//                break;
//            }
//        }
//    }


    public static void main(String[] args) {  //do...while
        int max = 1000;
        int min = 1;
        Random random = new Random();
        int randomNum = random.nextInt(max) % (max - min + 1) + min;
        System.out.println(randomNum);
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你猜测的数字（1-1000）,退出请按0：");
            int i = scanner.nextInt();
            if (i == 0) {
                System.out.println("真遗憾，下次再挑战吧！");
                break;
            }
            if (i > randomNum) {
                System.out.println("太大了");
            } else if (i < randomNum) {
                System.out.println("太小了");
            } else {
                System.out.println("恭喜，你猜对了！");
                break;
            }
        } while (true);
    }
}
