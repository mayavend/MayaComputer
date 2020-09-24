package MayaNotebook;

public class IsLetterNumber {
    public static boolean Letter(char ch){
        boolean isL = true;
        if(ch>='A' && ch<='Z'){
           isL = true;
        }
        else{
            isL = false;
        }
        return isL;
    }
    public static boolean Number(char n){
        boolean isN = true;
        if(n>=0 && n<=9){
            isN = true;
        }
        else{
            isN = false;
        }
        return isN;
    }
}
