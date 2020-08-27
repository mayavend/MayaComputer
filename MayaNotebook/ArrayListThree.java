package MayaNotebook;

import java.util.ArrayList;

public class ArrayListThree {
    public static void main(String[] args) {
        ArrayList<String> l1= new ArrayList<>();
        l1.add("M");
        l1.add("R");
        l1.add(" ");
        l1.add("S");
        l1.add("U");
        l1.add("N");

        for (int i = 0; i < l1.size() ; i++) {
            System.out.print(l1.get(i));

        }
    }
}
