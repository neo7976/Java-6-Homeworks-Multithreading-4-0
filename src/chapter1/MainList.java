package chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainList {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = Collections.synchronizedList(list);

        new Thread(() -> {
            list2.add(1);
            list2.add(2);
            list2.add(3);
            list2.add(4);
        }).start();


        new Thread(() -> {
            list2.add(5);
        }).start();

        Thread.sleep(1000);


        System.out.println(list2);

    }
}
