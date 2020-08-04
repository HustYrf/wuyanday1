package basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;


public class QuestionFifteen {

    public void testAddAllAndContainsAll() {
        Collection<String> c1 = new ArrayList<String>();
        c1.add("terry");
        c1.add("allen");
        System.out.println(c1);
        Collection<String> c2 = new HashSet<String>();
        c2.addAll(c1);
        System.out.println(c2);
        Collection<String> c3 = new ArrayList<String>();
        c3.add("terry");
        System.out.println(c1.containsAll(c3));
    }

    public void testInsertAndRemove() {
        List<String> list = new ArrayList<String>();
        list.add("terry");
        list.add("allen");
        list.add("smith");
        list.add(2, "marry");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }

    public void testSubList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        List<Integer> subList = list.subList(2, 5);
        for (int i = 0; i < subList.size(); i++) {
            subList.set(i, subList.get(i) * 10);
        }
        System.out.println(subList);
        System.out.println(list);
    }

    public static void main(String[] args) {
        QuestionFifteen questionFifteen = new QuestionFifteen();
        questionFifteen.testAddAllAndContainsAll();
        questionFifteen.testInsertAndRemove();
        questionFifteen.testSubList();
    }
}
