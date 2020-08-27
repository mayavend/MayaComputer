package MayaNotebook;

import java.util.ArrayList;

public class ArrayListColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("ORANGE");
        colors.add("YELLOW");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("PURPLE");
int i;
boolean m=false;
        for (i = 0; i <colors.size(); i++) {
            if(colors.get(i) == "GREEN"){
                m = true;
                System.out.println("true");
                break;
            }
        }
    if (m == false){
        System.out.println("false");
    }

    }
}
