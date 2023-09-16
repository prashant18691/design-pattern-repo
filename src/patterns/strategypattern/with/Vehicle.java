package patterns.strategypattern.with;

import patterns.strategypattern.with.strategy.IDriveStrategy;

 public class Vehicle {
    private final IDriveStrategy driveStrategy;

    public Vehicle(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
