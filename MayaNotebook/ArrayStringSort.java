package MayaNotebook;

public class ArrayStringSort {
    public static void main(String[] args) {
        char[] letters= {'B', 'D', 'A', 'E', 'C'};

        for (int i =0; i<letters.length; i++){
            for(int n =1; n<letters.length-i; n++){
                if(letters[i] > letters[i+n]){
                    char a = letters[i];
                    letters[i] = letters[i+n];
                    letters[i+n] = a;
                }
            }
        }

        for(int k =0; k<letters.length; k++){
            System.out.println(letters[k]);
        }
    }
}
