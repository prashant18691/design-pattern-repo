package patterns.strategy.with;

import patterns.strategy.with.strategy.NormalDriveStrategy;

 public class GoodsVehicle extends Vehicle{
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
