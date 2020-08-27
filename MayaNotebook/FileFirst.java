package MayaNotebook;

public class FileFirst {
    public static void main(String[] args) {
        //1-100 divisible by 4 but not by 5
        for (int i =1; i<=100; i++){
//            if (i%5 ==0){
//                continue;
//            }
//            if (i%4 !=0){
//                continue;
//            }
//            System.out.println(i);
            if (i%4 ==0 && i%5 !=0){
                System.out.println(i);
            }
        }
    }
}
