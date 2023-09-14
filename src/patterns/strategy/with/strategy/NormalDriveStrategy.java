package patterns.strategy.with.strategy;

public class NormalDriveStrategy implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive mode");
    }
}
