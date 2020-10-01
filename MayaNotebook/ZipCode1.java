package MayaNotebook;

public class ZipCode1 {
    private String fiveDigit;
    private String plus4;

    public ZipCode1(){
        fiveDigit="00000";
        plus4 = null;
    }
    public ZipCode1(String f){
        fiveDigit=f;
    }
    public ZipCode1(String f, String r){
        fiveDigit=f;
        plus4=r;
    }
    public void Display(){
        if(plus4 == null) {
            System.out.println(fiveDigit);
        }

        else{
            System.out.println(fiveDigit+"-"+plus4);
        }
    }
}
