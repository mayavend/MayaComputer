package MayaNotebook;

import java.util.ArrayList;

public class ALCompare {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(6);
        list.add(10);
        list.add(15);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(2);
        list2.add(3);
        list2.add(9);
        list2.add(10);
        list2.add(17);

        for (int i = 0; i < list.size(); i++) {

                if(list.get(i) != (list2.get(i))){
                    System.out.println(list.get(i));
                }

        }
    }
}
