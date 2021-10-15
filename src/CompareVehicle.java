import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Criterion {
     BY_SPEED,
     BY_CARRYING,
     BY_LOUDNESS
}

public class CompareVehicle {
    static Criterion criterion = Criterion.BY_SPEED;

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Vehicle bike = new Bike();
        Vehicle lorry = new Lorry();
        Vehicle car = new Car();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(lorry);
        Collections.sort(vehicles);
        /*for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getClass().getName() + " " + vehicle.getSignal());
        }*/
        System.out.println("Самый быстрый: " + vehicles.get(0).getClass().getName());
        criterion = Criterion.BY_CARRYING;
        Collections.sort(vehicles);
        System.out.println("Самый грузоподъемный: " + vehicles.get(0).getClass().getName());
        criterion = Criterion.BY_LOUDNESS;
        Collections.sort(vehicles);
        System.out.println("Самый громкий: " + vehicles.get(0).getClass().getName());

    }
}
