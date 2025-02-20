public class Car {
    private String name;

    private Car() {

    }

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        Car otherCar = (Car) obj;
        if (otherCar == null)
            return false;
        return this.name.equals(otherCar.name);
    }
}
