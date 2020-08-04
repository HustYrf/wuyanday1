package basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionTenTest {
    @Test
    public void test() {
        QuestionTen qTen = new QuestionTen("able was i ere i saw elba");

        assertEquals(true, qTen.isPalindrome(qTen.str));

//        assertEquals(false, qTen.isPalindrome(qTen.str));
    }
}
