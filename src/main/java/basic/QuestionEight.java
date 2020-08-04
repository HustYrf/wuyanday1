package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class QuestionEight {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        StringBuilder beginStr = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
            if (i < arr.length - 1) {
                beginStr.append(arr[i]).append("，");
            } else {
                beginStr.append(arr[i]).append("]");
            }
        }
        System.out.println(beginStr.toString());
        List<Integer> integers = generateRandomList(arr);
        System.out.println("-------------冒泡排序开始-----------------");
        bubbleSort(integers);
        System.out.println("-------------冒泡排序结束-----------------");
        print(integers);
    }

    //生成数组list
    public static List<Integer> generateRandomList(int[] arr) {
        List<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            randomList.add(arr[i]);
        }
        return randomList;
    }

    //冒泡排序
    public static List<Integer> bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            print(list);
            boolean flag = false;
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //相邻两个元素作比较，如果前面元素大于后面，进行交换
                if (list.get(j) > list.get(j + 1)) {
                    Integer temp = list.get(j + 1);
                    //List集合给指定下标赋值
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return list;
    }

    //增加输出格式化
    public static void print(List<Integer> list) {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1) {
                System.out.print(list.get(i) + "，");
            } else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("]");
    }
}
