package patterns.strategy.with;

import patterns.strategy.with.strategy.SportsDriveStrategy;

public class OffroadVehicle extends Vehicle{
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
