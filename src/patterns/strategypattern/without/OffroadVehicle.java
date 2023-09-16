package patterns.strategypattern.without;

class OffroadVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Sports drive mode");
    } // duplicated code
}
