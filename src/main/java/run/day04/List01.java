package run.day04;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName List
 * @Description: TODO
 * @Author wuke
 * @Date 2022-02-24 09:55
 * @Copyright: Copyright (c) 2021
 * @Version 1.0
 **/

public class List01 {
    public static void main(String[] args) {
        int data[] = new int[]{1, 2, 3, 4}; //静态初始化
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);
//        System.out.println(data[4]);

        int data1[] = new int[3];
        data1[1] = 33;
        data1[2] = 1;
        data1[0] = 332;
        for (int i = 0; i < data1.length; i++) {
            int datum = data1[i];
            System.out.println(datum);
        }

    }
}

class List02 {
    public static void main(String[] args) {
        int data1[] = new int[]{1, 2, 3};
        int data2[] = data1;
        data2[0] = 99;
        for (int i = 0; i < data1.length; i++) {
            int i1 = data1[i];
            System.out.println(i1);

        }
        int data3[] = null;
        System.out.println(data3[0]);
    }
}

class List03 {
    public static void main(String[] args) {
        int data[] = new int[]{1, 2, 3, 4, 5};
        for (int datum : data) {
            System.out.println(datum);
        }
    }

}

class List04 {
    public static void main(String[] args) {
        List<List> list = new ArrayList<>();

    }

}


