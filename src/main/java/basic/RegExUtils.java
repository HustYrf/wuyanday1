package basic;

/**
 * @ClassName RegExUtils
 * @Descripition TODO
 * @Author Administrator
 * @Date 2020/8/4 14:50
 **/
public class RegExUtils {
    public static final String IDENTITY_CARD = "^"
            + "\\d{6}" // 6位地区码
            + "(18|19|([23]\\d))\\d{2}" // 年YYYY
            + "((0[1-9])|(10|11|12))" // 月MM
            + "(([0-2][1-9])|10|20|30|31)" // 日DD
            + "\\d{3}" // 3位顺序码
            + "[0-9Xx]" // 校验码
            + "$";

    public static final String ZIP_CODE = "^[1-9]\\d{5}$";

    public static final String PHONE_NUMBER = "^[1](([3|5|8][\\d])|([4][4,5,6,7,8,9])|([6][2,5,6,7])|([7][^9])|([9][1,8,9]))[\\d]{8}$";

    //检验长度
    private static boolean checkLength(String inputString, int len) {
        if (inputString == null || inputString.length() != len) {
            return false;
        }
        return true;
    }


    //校验匹配度
    private static boolean check(String inputString, String regex) {
        return inputString.matches(regex);
    }

    //身份证
    public static boolean identityCard(String IDNo18) {
        // 校验身份证号码的长度
        if (!checkLength(IDNo18, 18)) {
            throw new IllegalArgumentException();
        }
        // 匹配身份证号码的正则表达式
        if (!check(IDNo18, IDENTITY_CARD)) {
            return false;
        }

        return true;
    }

    //邮政编码
    public static boolean zipCode(String ZipCode6) {
        // 校验邮政编码的长度
        if (!checkLength(ZipCode6, 6)) {
            throw new IllegalArgumentException();
        }
        // 匹配邮政编码的正则表达式
        if (!check(ZipCode6, ZIP_CODE)) {
            return false;
        }
        return true;
    }

    //电话号码
    public static boolean phoneNumber(String PhoneNum11) {
        // 校验电话号码的长度
        if (!checkLength(PhoneNum11, 11)) {
            throw new IllegalArgumentException();
        }
        // 匹配电话号码的正则表达式
        if (!check(PhoneNum11, PHONE_NUMBER)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(identityCard("4209991995070732XX"));
        System.out.println(phoneNumber("11111111111"));
        System.out.println(zipCode("420000"));
    }
}
