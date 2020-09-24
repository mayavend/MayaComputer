package MayaNotebook;

public class MethodTwinPrimes {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (isPrime(i) == true && isPrime(i+2) == true) {
                int m = i+2;
                System.out.print(i + " " + m);
                System.out.println();
            }
        }
    }

    static boolean isPrime(int a){
        if(a<2){
            return false;
        }
        for (int i = 2; i < a/2+1; i++) {
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
