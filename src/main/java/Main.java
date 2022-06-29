public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.listAllCars();

        Car ford = new Car("Ford");
        garage.addCar(ford);

        garage.listAllCars();

        Car jeep = new Car("Jeep");
        garage.addCar(jeep);

        garage.listAllCars();

        garage.removeCar(ford);

        garage.listAllCars();

        garage.removeCar(jeep);

        garage.listAllCars();

    }
}
