package run.day02;

/**
 * @ClassName daimakuai01
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-17 10:50
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class daimakuai01 {
    static {
        System.out.println("2");
    }
    public static void main(String[] args) {
//        { //普通代码块
//            int x = 10;
//            System.out.println("x = " +x);
//        }
//        int x = 100;
//        System.out.println("x = " +x);
        System.out.println("11");
        new Person();
        new Person();
        new Person();
    }
}

class Person {
    public Person() {
        System.out.println("构造方法");
    }

    static {
        System.out.println("静态块");
    }

    {
        System.out.println("构造快1");
    }
}
