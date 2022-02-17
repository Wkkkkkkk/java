package run.day01;

/**
 * @ClassName Test02
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-16 13:59
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

class Preson { //创建同一个国家的类
    private String name;
    private int age;
    private static String country = "中华民国";

    public Preson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public enum aa {
        s, a, d
    }

    public static void setCountry(String c) {
        country = c;
    }

    public String getInfo() {
        return "名字：" + this.name + "、年龄：" + this.age + "、国家：" + this.country;
    }
}

public class Static01 {
    public static void main(String[] args) {
//        Preson p1 = new Preson("吴珂1", 24);
//        Preson p2 = new Preson("吴珂2", 23);
//        Preson p3 = new Preson("吴珂3", 24);
//        Preson.setCountry("111");
//        System.out.println(p1.getInfo());
//        System.out.println(p2.getInfo());
//        Preson.setCountry("a");
//        System.out.println(p3.getInfo());
        System.out.println(new Book("book1").getTitle());
        System.out.println(new Book("book2").getTitle());
        System.out.println(new Book("book3").getTitle());
        System.out.println(new Book().getTitle());
        System.out.println(new Book().getTitle());
    }

}

class Book {
    private String title;
    private static int count = 0;

    public Book() {
        this("No" + count++);
    }

    public Book(String title) {
        this.title = title;
    }

    String getTitle() {
        return this.title;
    }
}
