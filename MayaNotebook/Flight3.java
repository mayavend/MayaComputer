package MayaNotebook;

public class Flight3 {
//    Create FLight3 and Flight3_Main from previous classes.
//    For the object with all the values, use Buffered reader to accept
//    the values needed for the object creation and then supply it to the constructor.
//    Write getter and setter, tostring .
//    Make use of the setter to change the values of an objects which is already created.

    int flight_id;
    String operatedBy;
    String startsFrom;
    String destination;
    int distance;
    int totalSeats;
    int remainingSeats;
    String startTime;
    double price;

    public Flight3(int id, String operator, String start, String end, int dist, int seatsTotal, int seatsLeft, String time, double cost){
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

    public int getID(){
        return flight_id;
    }
    public int getDistance(){
        return distance;
    }
    public int getTotalSeats(){
        return totalSeats;
    }
    public int getRemainingSeats(){
        return remainingSeats;
    }
    public String getOperator(){
        return operatedBy;
    }

    public String getStartsFrom(){
        return startsFrom;
    }
    public String getDestination(){
        return destination;
    }
    public String getStartTime(){
        return startTime;
    }
    public double getPrice(){
        return price;
    }

    @Override
    public String toString(){
        return "This is a flight class which gives information about a flight.";
    }

    public void setFlight_id(int id){
        flight_id=id;
    }

    public void setOperatedBy(String o){
        operatedBy=o;
    }
}
