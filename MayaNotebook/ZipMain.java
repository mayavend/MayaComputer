package MayaNotebook;

public class ZipMain {
    public static void main(String[] args) {
        ZipCode1 z1 = new ZipCode1();
        ZipCode1 z2 = new ZipCode1("90210");
        ZipCode1 z3 = new ZipCode1("16802", "1503");

        z1.Display();
        z2.Display();
        z3.Display();
    }
}
