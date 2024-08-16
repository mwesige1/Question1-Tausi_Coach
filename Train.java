

package train;


public class Train {

    public static void main(String[] args) {
        // Distance from Kampala to Jinja
        int distance = 80; 

        // Stop intervals
        int passengerStopInterval = 150; 
        int refuelStopInterval = 200;
        // Calculate the number of stops
        int passengerStops = distance / passengerStopInterval;
        int refuelStops = distance / refuelStopInterval;

        // Since we want the number of stops, we need to account for any remaining distance
         if (distance % passengerStopInterval != 0) {
            passengerStops++;
        }
        if (distance % refuelStopInterval != 0) {
            refuelStops++;
        }

        // Total stops
        int totalStops = passengerStops + refuelStops;

        // Output the results
        System.out.println("Total distance: " + distance + " km");
        System.out.println("Passenger stops: " + passengerStops);
        System.out.println("Refuel stops: " + refuelStops);
        System.out.println("Total stops: " + totalStops);
    }
}
