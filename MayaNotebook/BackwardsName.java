package MayaNotebook;

public class BackwardsName {
    public static void main(String[] args) {
        String name = "nina vendhan";
        int lengthStr = name.length();
        char maya;
        int n;
        for (n=1; n<=lengthStr; n++){
            maya = name.charAt(lengthStr-n);
            System.out.print(maya);
        }

    }
}
