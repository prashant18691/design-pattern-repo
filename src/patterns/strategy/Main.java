package patterns.strategy;

import patterns.strategy.with.GoodsVehicle;
import patterns.strategy.with.OffroadVehicle;
import patterns.strategy.with.SportsVehicle;
import patterns.strategy.with.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
        Vehicle offroadVehicle = new OffroadVehicle();
        offroadVehicle.drive();

    }
}