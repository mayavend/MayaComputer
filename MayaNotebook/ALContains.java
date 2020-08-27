package MayaNotebook;

import java.util.ArrayList;

public class ALContains {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("ORANGE");
        colors.add("YELLOW");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("PURPLE");

        for (String c:colors) {
            System.out.println(c);

        }
        if(colors.contains("GREEN")){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
