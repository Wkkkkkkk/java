package run.day03;

/**
 * @ClassName Dog
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-21 10:55
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class Dog {
    private String name;
    private String color;
    private int age;

    public Dog() {
    }

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}

class Test03 {
    public static void main(String[] args) {
        Dog dog = new Dog("泡泡", "蓝白", 1);
        System.out.println(dog);
    }

}