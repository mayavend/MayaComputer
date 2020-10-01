package MayaNotebook;

public class ZipCode2 {
//    Create Zipcode2 and Zipcode2_Main from previous classes. For the object with all the values,
//    use Buffered reader to accept the values needed for the object creation and then supply it to the
//    constructor. Write getter and setter, tostring .
//    Make use of the setter to change the values of an objects which is already created.
private String fiveDigit;
    private String plus4;

    public ZipCode2(){
        fiveDigit="00000";
        plus4 = null;
    }
    public ZipCode2(String f){
        fiveDigit=f;
    }
    public ZipCode2(String f, String r){
        fiveDigit=f;
        plus4=r;
    }
    public String getFiveDigit(){
        return fiveDigit;
    }
    public String getPlus4(){
        return plus4;
    }
    public void setFiveDigit(String fi){
        fiveDigit=fi;
    }
    public void setPlus4(String fo){
        plus4=fo;
    }

    @Override
    public String toString(){
        return "This class prints the zipcode.";
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
