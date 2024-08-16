package train;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;
public class approximateArrival {


     public static void main(String[] args) {
        // Given values
        double speedMps = 225.5; 
        double distanceKm = 405; 
        LocalTime departureTime = LocalTime.of(9, 0); 

        // Convert speed to km/h
        double speedKmph = speedMps * 3.6;

        // Calculate travel time in hours
        double travelTimeHours = distanceKm / speedKmph;

        // Convert travel time to minutes
        double travelTimeMinutes = travelTimeHours * 60;

        // Calculate arrival time
        LocalTime arrivalTime = departureTime.plusMinutes((long) travelTimeMinutes);
        // Format and display the results
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println("Departure Time: " + departureTime.format(formatter));
        System.out.println("Travel Time: " + travelTimeMinutes + " minutes");
        System.out.println("Arrival Time: " + arrivalTime.format(formatter));
    }
    
}
