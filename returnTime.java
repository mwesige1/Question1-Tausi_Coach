
package train;


public class returnTime {
    public static void main(String[] args) {
        // Given values
        int distance = 405; // Distance from Kabale to Kampala in kilometers
        int speed = 250; // Speed of the train in km/h
        int refuelStopTimeMinutes = 5; // Time taken for each refuel stop in minutes
        int refuelStopInterval = 200; // Distance between refuel stops in km

        // Calculate travel time without stops
        double travelTimeHours = (double) distance / speed; // Time in hours
        double travelTimeMinutes = travelTimeHours * 60; // Convert to minutes

        // Calculate number of refuel stops
        int refuelStops = distance / refuelStopInterval;
        // Check if there is a remaining distance that requires an additional stop
        if (distance % refuelStopInterval != 0) {
            refuelStops++; // Add an additional stop if there's remaining distance
                    }

        // Calculate total refuel time
        int totalRefuelTime = refuelStops * refuelStopTimeMinutes;

        // Calculate total time taken
        double totalTimeMinutes = travelTimeMinutes + totalRefuelTime;

        // Output the results
        System.out.println("Total distance: " + distance + " km");
        System.out.println("Travel time without stops: " + travelTimeMinutes + " minutes");
        System.out.println("Total refuel time: " + totalRefuelTime + " minutes");
        System.out.println("Total time taken for the return journey: " + totalTimeMinutes + " minutes");
    }
}
            
    

