package lesson3.labs.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
    private List<Building> buildings;
    public LandlordInfo() {
        this.buildings = new ArrayList<>();
    }
    public void addBuilding(Building building) {
        buildings.add(building);
    }
    public double calcProfits() {
        double totalProfit = 0;
        for (Building b : buildings) {
            totalProfit += b.calcProfits();
        }
        return totalProfit; // TotalRent - TotalMaintenanceCost on Each Building
    }
}
