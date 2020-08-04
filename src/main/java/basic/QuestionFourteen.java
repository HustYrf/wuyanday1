package basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class QuestionFourteen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入生产日期(yyyy-MM-dd)");
        String produceDateInput = scanner.next();   //生产日期
        System.out.println("请输入保质期(天数)");// 保质期天数
        int expirationDateInput = scanner.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date produceDate = null;
        try {
            produceDate = sdf.parse(produceDateInput);  //生产日期格式调整
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(produceDate);  //生产日期开始
        calendar.add(Calendar.DAY_OF_YEAR, expirationDateInput);  //加上保质期
        calendar.add(Calendar.DAY_OF_YEAR, -14);   //减掉最近14天
        calendar.set(Calendar.DAY_OF_WEEK, 4); //周三

        Date promotionDate = calendar.getTime(); //促销日期
        System.out.println("促销日期：" + sdf.format(promotionDate));
    }
}
