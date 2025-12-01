package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, 3, 18);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("hh:mm:ss a");
        LocalTime time = LocalTime.parse("10:05:34 AM", fmt);

        int astronautCount = 7;
        String astronautStatus = "ready";
        double averageAstronautMassKg = 80.7;
        int fuelMassKg = 760000;
        double shuttleMassKg = 74842.31;
        int maximumMassLimit = 850000;
        int fuelTempCelsius = -225;
        int minimumFuelTemp = -300;
        int maximumFuelTemp = -150;
        String fuelLevel = "100%";
        String weatherStatus = "clear";
        boolean preparedForLiftOff = true;

        double crewMassKg = astronautCount * averageAstronautMassKg;
        double totalMassKg = crewMassKg + fuelMassKg + shuttleMassKg;

        if(astronautCount <= 7 &&
                astronautStatus.equals("ready") &&
                totalMassKg < maximumMassLimit &&
                fuelTempCelsius >+ -300 && fuelTempCelsius <= -150 &&
                fuelLevel.equals("100%") &&
                        weatherStatus.equals("clear")){
            System.out.println("Launch");
        } else {
            System.out.println("Hold");
        }
    }
}