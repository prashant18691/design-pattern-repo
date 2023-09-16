package patterns.strategypattern;

import patterns.strategypattern.with.GoodsVehicle;
import patterns.strategypattern.with.OffroadVehicle;
import patterns.strategypattern.with.SportsVehicle;
import patterns.strategypattern.with.Vehicle;

 class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
        Vehicle goodsVehicle = new GoodsVehicle();
        goodsVehicle.drive();
        Vehicle offroadVehicle = new OffroadVehicle();
        offroadVehicle.drive();

    }
}