package MayaNotebook;

import java.util.Arrays;

public class ArraySort1 {
    public static void main(String[] args) {
        int[] list1 = {13, 3, 11, 2, 7, 5};
//        for (int j = 0; j<list1.length; j++){
//            System.out.println(list1[j]);
//        }

//        Arrays.sort(list1);
//        for (int l: list1) {
//            System.out.println(l);
//        }

        Arrays.sort(list1, 0,6);
        System.out.println(Arrays.toString(list1));


    }
}
