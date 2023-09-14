package patterns.strategy.with.strategy;

public class SportsDriveStrategy implements IDriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports drive mode");
    }
}
