package run.day03;

/**
 * @ClassName User
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-24 09:40
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class User {
    private String uid;
    private String password;
    private static int count = 0;

    public User() {
        this("noid", "no pass");
    }

    public User(String uid) {
        this(uid, "no pass");
    }

    public User(String uid, String password) {
        this.uid = uid;
        this.password = password;
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

class Test05 {
    public static void main(String[] args) {
        User user = new User();
        User user1 = new User("w");
        User user2 = new User("2", "www");
        System.out.println(user);
        System.out.println(user1);
        System.out.println(user2);
        System.out.println(User.getCount());
    }
}
