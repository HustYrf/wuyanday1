package basic;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpComparator implements Comparator<Emp> {

    public static void main(String[] args) {
        List<Emp> emps = new ArrayList<Emp>(3);
        emps.add(new Emp("Terry", 25, 'm', 6000));
        emps.add(new Emp("Allen", 21, 'm', 4000));
        emps.add(new Emp("Smith", 23, 'm', 3000));

        EmpComparator empComparator = new EmpComparator();
        Collections.sort(emps, empComparator);  //调用集合工具类排序
        for (Emp e : emps) {
            System.out.println(e);
        }
    }


    public int compare(Emp e1, Emp e2) {  //比较
        if (e1.equals(e2)) {
            return 0;
        }
        return e1.getSalary() - e2.getSalary();
    }
}


class Emp {   //EMP类
    private String name;
    private int age;
    private char gender;
    private int salary;

    public Emp(String name, int age, char gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp [name=" + name + ", age=" + age + ", gender=" + gender + ", salary=" + salary + "]";
    }
}