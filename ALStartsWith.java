import java.util.ArrayList;

public class ALStartsWith {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("RED");
        colors.add("ORANGE");
        colors.add("BILLY");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("BOB");

        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).startsWith("B")){
                System.out.println(colors.get(i));
            }
        }
    }
}
