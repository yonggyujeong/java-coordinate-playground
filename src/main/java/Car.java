public abstract class Car {

    private int distance;
    protected int fuel;

    public Car(int distance) {
        this.distance = distance;
    }

    abstract int calculateFuel(int distance);
}
