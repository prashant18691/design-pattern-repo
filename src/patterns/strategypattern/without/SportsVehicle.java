package patterns.strategypattern.without;

class SportsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Sports drive mode");
    } // duplicated code
}
