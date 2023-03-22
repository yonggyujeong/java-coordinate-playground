package injectFuel.car;

public class Avante extends Car {

    private static long FUEL_EFFICIENCY = 10;

    public Avante(long distance) {
        super(distance);
    }

    @Override
    long calculateFuel(long distance) {
        this.fuel = distance / FUEL_EFFICIENCY;
        return this.fuel;
    }
}
