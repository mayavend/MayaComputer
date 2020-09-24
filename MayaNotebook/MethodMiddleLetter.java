package MayaNotebook;

public class MethodMiddleLetter {
    public static void main(String[] args) {
        String name = "mayave";
        String k = Mult(name);
        System.out.println(k);
    }
    static String Mult(String a){
        int l = a.length();
        int p = l/2;
        if(l%2 ==1){
            String d = a.substring(p,p+1);
            return d;
        }
        else{
            String d = a.substring(p-1,p+1);
            return d;
        }
    }
}
