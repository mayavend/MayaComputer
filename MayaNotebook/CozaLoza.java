package MayaNotebook;

public class CozaLoza {
//    Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
//    The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza"
//    for multiples of 5, "Woza"for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.
//    The output shall look like:
public static void main(String[] args) {
    int count;
    int number;

    for (number =1; number<=110; number++) {
            if (number % 3 == 0 && number % 5 != 0) {
                System.out.print("Coza ");
            } else if (number % 5 == 0 && number % 3 != 0) {
                System.out.print("Loza ");
            } else if (number % 7 == 0) {
                System.out.print("Woza ");
            } else if (number % 15 == 0) {
                System.out.print("CozaLoza ");
            } else {
                System.out.print(number + " ");
            }
            if (number%11==0){
                System.out.println();
            }
    }

}
}
