package MayaNotebook;

import java.util.Scanner;

public class MethodWordCountString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter");
        String sentence = sc.nextLine();
        System.out.println(Count(sentence));
    }
    static int Count(String b){
        int wCount =0;
        String a = b.trim();
        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == ' '){
                wCount++;
            }
        }
        return wCount;
    }
}
