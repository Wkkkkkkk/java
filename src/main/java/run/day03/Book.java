package run.day03;

/**
 * @ClassName Book
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-24 09:48
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class Book {
    private int bid;
    private String title;
    private double price;
    private static int count = 0;

    public Book(String title, double price) {
        this.bid = count++;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public static int getCount() {
        return count;
    }
}

class Test06 {
    public static void main(String[] args) {
        System.out.println(new Book("java", 21.2));
        System.out.println(new Book("javac", 11.2));
        System.out.println(Book.getCount());

    }
}
