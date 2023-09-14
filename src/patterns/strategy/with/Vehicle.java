package patterns.strategy.with;

import patterns.strategy.with.strategy.IDriveStrategy;

 public class Vehicle {
    private final IDriveStrategy driveStrategy;

    public Vehicle(IDriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        this.driveStrategy.drive();
    }
}
