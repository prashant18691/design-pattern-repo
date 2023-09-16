package patterns.strategypattern.with;

import patterns.strategypattern.with.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
