package patterns.strategypattern.with;

import patterns.strategypattern.with.strategy.NormalDriveStrategy;

 public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
