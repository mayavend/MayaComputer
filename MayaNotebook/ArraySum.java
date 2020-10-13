package MayaNotebook;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {

        int[]arr = {3,7,12,2,8};
        int sum =0;
        int mode=arr[1];
        for (int i = 0; i < arr.length; i++) {
            sum = sum+ arr[i];
            if(mode==arr[i]){

            }

        }
        double avg = (double)sum/arr.length;

    }

}
