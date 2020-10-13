package MayaNotebook;

public class ArrayMinMax {
    public static void main(String[] args) {
        int[] arr = {3,8,2,5,10, 1, 13};
        int min=arr[0];
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i+1]<min){
                min = arr[i+1];
                max = min;
            }
            else{
               // min = min;
                max = arr[i+1];
            }
        }
        System.out.println("Min:" +min + " Max:" + max);
    }
}
