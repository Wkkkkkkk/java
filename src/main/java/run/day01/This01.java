package run.day01;


/**
 * @ClassName Person
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-16 10:33
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

class Person {
    private  String name;
    private int age;

    public Person() {
        System.out.println("run");
    }

    public Person(String name) {
        this();
        this.setName(name);
    }

    public Person(String name, int age) {
        this(name);
        this.setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void tell(String name, int age) {
        System.out.println("姓名-" + this.getName() + "、年龄-" + this.getAge());
    }
}

class Emp {
    private long empno;   //员工编号
    private String ename; //员工姓名
    private String dept;  //员工部门
    private  double salary;//员工薪资

    public Emp() {
        this(1000, "无名氏", null, 0);
    }

    public Emp(long empno) {
        this(empno, "新员工", "未定义", 0);
    }

    public Emp(long empno, String ename, String dept) {
        this(empno, ename, dept, 2500);
    }

    public Emp(long empno, String ename, String dept, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.dept = dept;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getInfo() {
        return "员工编号：" + this.empno
                + "、员工姓名：" + this.ename
                + "、员工部门：" + this.dept
                + "、员工薪资：" + this.salary
                ;
    }
}

public class This01 {
    public static void main(String[] args) {
//        Person p = new Person("1", 2);
//        p.tell("1", 12);
        Emp emp = new Emp(2000, "@", "2");
        emp.setSalary(20000.00);
        System.out.println(emp.getInfo());
    }

}
