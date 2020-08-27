package MayaNotebook;

public class Fibonacci {
    public static void main(String[] args) {
//        Write a program called Fibonacci to print the first 20
//        Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1.
//        Also compute their average. The output shall look like:
        //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765

        int number;
        int t1 =0;
        int t2 =1;

        System.out.println(t2);
        int temp;
        int sum;
        for (number =1; number<=20; number++){
          //  System.out.print(t1 + " "); // t1 = 2
          //  System.out.print(t2 + " "); // t2 = 3
            sum = t1+t2;
            if (sum >20){
                break;
            }
            System.out.println(sum + " "); // sum = 5
            //temp = t2; //temp =3
            t1 = t2; // t1 = 3
            t2 = sum; // t2 = 5
        }
    }
}
