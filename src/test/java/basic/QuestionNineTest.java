package basic;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuestionNineTest {

    @Test
    public void test() {
        QuestionNine qNine = new QuestionNine("adsadsada/dsfdsadfas/1234");

        assertEquals("1234", qNine.subStr(qNine.str));

//        assertEquals("12345", qNine.subStr(qNine.str));
    }
}
