package run.day03;

/**
 * @ClassName Account
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-21 18:24
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class Account {
    private String name;
    private double balance;

    public Account() {
    }

    public Account(String name) {
        this.name = name;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
class Test04{
    public static void main(String[] args) {
        Account account = new Account("吴珂", 2233123123.3);
        
        System.out.println(account);
    }
}
