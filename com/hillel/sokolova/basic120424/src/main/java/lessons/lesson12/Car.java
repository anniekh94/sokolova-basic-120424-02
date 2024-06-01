package lessons.lesson12;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Electricity of car starts.");
    }

    private void startCommand() {
        System.out.println("Car starts.");
    }

    private void startFuelSystem() {
        System.out.println("Fuel system starts.");
    }
}
