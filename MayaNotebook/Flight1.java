package MayaNotebook;

public class Flight1 {
//    Homework4. Create a class called Flight1. The Flight1 class will contain instance variables:
//    flight_id, operatedBy(This variable will store the name of the company which owns the Airlines),
//    startsFrom(place where the flights from), destination(place where the flights reaches),
//    distance(distance between the two places.), totalSeats , remainingSeats,
//    startTime(When the flight leaves),price
//    Use Constructor to supply values for these variables.
//    Write a method named getFlightDetails which prints the variables clearly.
//    Create Flight1_Main class which contain main method. In the main method create two
//    flight objects by prompting user to enter the values and using the constructor you just created.
//    Call the getFlightDetails on these
//    Try changing the destination and call the getFlightDetails
    int flight_id;
    String operatedBy;
    String startsFrom;
    String destination;
    int distance;
    int totalSeats;
    int remainingSeats;
    String startTime;
    double price;

//    public Flight1(){
//        flight_id = 3350;
//        operatedBy = "Lufthansa";
//        startsFrom = "Chicago";
//        destination = "Frankfurt";
//        distance = 4325;
//        totalSeats = 800;
//        remainingSeats = 231;
//        startTime = "10:40";
//        price = 700;
//    }

    public Flight1(int id, String operator, String start, String end, int dist, int seatsTotal, int seatsLeft, String time, double cost){
        flight_id = id;
        operatedBy = operator;
        startsFrom = start;
        destination = end;
        distance = dist;
        totalSeats = seatsTotal;
        remainingSeats = seatsLeft;
        startTime = time;
        price = cost;
    }

    public void getFlightDetails(){
        System.out.println(" flight id: " + flight_id);
        System.out.println(" operated by: " + operatedBy);
        System.out.println(" starts from: " + startsFrom);
        System.out.println(" destination: " + destination);
        System.out.println(" distance: " +distance);
        System.out.println(" total seats: " + totalSeats);
        System.out.println(" remaining seats: " +remainingSeats);
        System.out.println(" start time: " + startTime);
        System.out.println(" price: " + price);
    }
}
