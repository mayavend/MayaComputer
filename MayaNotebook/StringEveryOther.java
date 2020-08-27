package MayaNotebook;

public class StringEveryOther {
    public static void main(String[] args) {
        String name = "azhi vendhan";
        int lengthStr = name.length();
        char maya;
        int n;
        for (n=1; n<=lengthStr; n+=2){
            maya = name.charAt(n);
            System.out.print(maya);
        }


    }
}
