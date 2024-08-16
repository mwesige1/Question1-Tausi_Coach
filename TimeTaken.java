
package train;


public class TimeTaken {
    public static void main(String[] args) {
        // Given values
        int distance = 405; // Distance from Kampala to Kabale in kilometers
        int speed = 250; // Speed of the train in km/h
        int stopTimeMinutes = 5; // Time taken for each stop in minutes
        int passengerStopInterval = 150; // Distance between passenger stops in km
        int refuelStopInterval = 200; // Distance between refuel stops in km

        // Calculate travel time without stops
        double travelTimeHours = (double) distance / speed; // Time in hours
        double travelTimeMinutes = travelTimeHours * 60; // Convert to minutes

        // Calculate number of stops
        int passengerStops = distance / passengerStopInterval;
        int refuelStops = distance / refuelStopInterval;

        // Total stops
        int totalStops = passengerStops + refuelStops;
        // Calculate total stop time
        int totalStopTime = totalStops * stopTimeMinutes;

        // Calculate total time taken
        double totalTimeMinutes = travelTimeMinutes + totalStopTime;

        // Output the results
        System.out.println("Total distance: " + distance + " km");
        System.out.println("Travel time without stops: " + travelTimeMinutes + " minutes");
        System.out.println("Total stop time: " + totalStopTime + " minutes");
        System.out.println("Total time taken: " + totalTimeMinutes + " minutes");
    }
    
}
