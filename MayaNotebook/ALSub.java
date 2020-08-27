package MayaNotebook;

import java.util.ArrayList;

public class ALSub {
    public static void main(String[] args) {
       ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(15);

        System.out.println(list.subList(2,5));
    }
}
