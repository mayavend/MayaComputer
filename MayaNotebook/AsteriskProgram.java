package MayaNotebook;

public class AsteriskProgram {
    public static void main(String[] args) {
        String asterisk = "*";
        int i;
        String sum = " ".concat(asterisk);
        for (i = 1; i<=10; i++){
            System.out.println(sum);
            sum = " ".concat(sum);

        }

    }
}
