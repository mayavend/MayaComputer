package MayaNotebook;

import java.util.Scanner;

public class Flight3_Main {
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

        Flight3 f3 = new Flight3(id, operator, start, end, dist, seatsTotal, seatsLeft, time, cost);

        //toString print
        System.out.println(f3);
        System.out.println();

        //getters
        System.out.println(" flight id: " + f3.getID());
        System.out.println(" operated by: " + f3.getOperator());
        System.out.println(" starts from: " + f3.getStartsFrom());
        System.out.println(" destination: " + f3.getDestination());
        System.out.println(" distance: " + f3.getDistance());
        System.out.println(" total seats: " + f3.getTotalSeats());
        System.out.println(" remaining seats: " + f3.getRemainingSeats());
        System.out.println(" start time: " + f3.getStartTime());
        System.out.println(" price: " + f3.getPrice());

        //setters
        f3.setFlight_id(637);
        f3.setOperatedBy("British Airways");

        System.out.println("Flight id has been changed to: " + f3.getID());
        System.out.println("Operator has been changed to: " + f3.getOperator());
    }
}
