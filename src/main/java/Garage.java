import java.util.ArrayList;
import java.util.List;

// garage has methods to add, remove and list the cars it has in it.
public class Garage {
    private List<Car> cars;

    public Garage() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        System.out.println(String.format("%nAdding %s to the Garage", car.getName()));
        cars.add(car);
    }

    public void removeCar(Car car) {
        System.out.println(String.format("%nRemoving %s from the Garage", car.getName()));
        cars.remove(car);
    }

    public void listAllCars() {
        System.out.println("\n ---- List of All Cars ----");
        if (cars.isEmpty()) {
            System.out.println("Garage is empty :(");
            return;
        }
        cars.stream().forEach(System.out::println);
    }

}
