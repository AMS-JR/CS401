package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private List<Double> maintenanceCosts;
    private List<Apartment> apartments;
    public Building(double... costs){
        this.maintenanceCosts = new ArrayList<>(); // Initialize the list
        for(double cost: costs){
            this.maintenanceCosts.add(cost); // Add each cost to the list
        }
        this.apartments = new ArrayList<>();
    }
    public void addApartment(Apartment apartment){
        apartments.add(apartment);
    }
    public double getTotalMaintenanceCost(){
        double total = 0;
        for(double cost: maintenanceCosts){
            total += cost;
        }
        return total;
    }
    public double getTotalRent(){
        double total = 0;
        for(Apartment apartment: apartments){
            total += apartment.getRent();
        }
        return total;
    }
    public double calcProfits(){
        return getTotalRent() - getTotalMaintenanceCost();
    }
}
