package basic;


import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class TestStringUtils {

    @Test
    public void testLeftPadAndRightPad() {
        String name = StringUtils.leftPad("goodman", 10, "*");
        System.out.println(name);

        name = StringUtils.rightPad("goodman", 10, "*");
        System.out.println(name);
    }

    @Test
    public void testRepeat() {
        String str = "java";
        str = StringUtils.repeat(str, 10);
        System.out.println(str);
    }


    @Test
    public void testJoin() {
        String[] strArr = {"Java", "C++", "C#", "PHP", "Objective-C"};
        String str = StringUtils.join(strArr, " ");
        System.out.println(str);
    }

}
