package MayaNotebook;

import java.util.Scanner;

public class Flight1_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a flight id:");
        int id = sc.nextInt();
        String operator = sc.next();
        String start = sc.next();
        String end = sc.next();
        int dist = sc.nextInt();
        int seatsTotal = sc.nextInt();
        int seatsLeft = sc.nextInt();
        String time = sc.next();
        double cost = sc.nextDouble();

        Flight1 f1 = new Flight1(id, operator, start, end, dist, seatsTotal,  seatsLeft,time,  cost);
        Flight1 f2 = new Flight1(id, operator, start, end, dist, seatsTotal,  seatsLeft,time,  cost);

        f1.getFlightDetails();
    }
}
