package basic;


public class QuestionNine {


    String str;

    public QuestionNine(String s) {
        this.str = s;
    }

    public static void main(String[] args) {
        //todo
    }

    public  String subStr(String str) {
        int indexOf = str.lastIndexOf("/");
        String result = str.substring(indexOf + 1);
        return result;
    }
}
