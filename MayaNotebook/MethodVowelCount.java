package MayaNotebook;

public class MethodVowelCount {
    public static void main(String[] args) {

        String name = "Maya venDhAn";
        System.out.println((Count(name)));
    }

    static int Count(String b){
        int vCount=0;
        String a = b.toUpperCase();
        for (int i = 0; i < a.length() ; i++) {
            if(a.charAt(i) == 'A' || a.charAt(i) =='E' || a.charAt(i) =='O' ||a.charAt(i) == 'I' || a.charAt(i) =='U'){
                vCount++;
            }
//            if(a.charAt(i) == 69){
//                vCount++;
//            }
//            if(a.charAt(i) == 73){
//                vCount++;
//            }
//            if(a.charAt(i) == 79){
//                vCount++;
//            }
//            if(a.charAt(i) == 85){
//                vCount++;
//            }
        }
        return vCount;
    }
}

