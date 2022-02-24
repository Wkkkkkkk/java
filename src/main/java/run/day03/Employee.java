package run.day03;


/**
 * @ClassName Employee
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-21 10:36
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class Employee {
    private long id;
    private String name;
    private double salary;
    private double rate;

    public Employee() {
    }

    public Employee(long id, String name, double salary, double rate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rate = rate;
    }

    public double salaryIncValue() {
        return salary * rate;
    }

    public double salaryIncResult() {
        salary = salary * (1 + rate);
        return salary * (1 + rate);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", rate=" + rate +
                '}';
    }
}

class Test02 {
    public static void main(String[] args) {
        Employee dd = new Employee(111, "dd", 3000.0, 0.3);
        System.out.println(dd);
        System.out.println(dd.salaryIncValue());
        dd.salaryIncResult();
        System.out.println(dd);
    }
}
