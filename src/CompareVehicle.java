import java.util.*;

enum Criterion {
     BY_SPEED,
     BY_CARRYING,
     BY_LOUDNESS,
     BY_DISTANCE,
     BY_PRICE,

}

public class CompareVehicle {
    static Criterion criterion = Criterion.BY_SPEED;
    /** документиция , авто документирование */
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> allVehicles = new ArrayList<>();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle lorry = new Lorry();
        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(lorry);
        Collections.sort(vehicles);
        /*for (Vehicle vehicle : vehicles){
            System.out.println(vehicle.getClass().getName() + " " + vehicle.getSignal());
        }*/

        System.out.println("Самый быстрый: " + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_CARRYING;
        Collections.sort(vehicles);
        System.out.println("Самый грузоподъемный: " + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_LOUDNESS;
        Collections.sort(vehicles);
        System.out.println("Самый громкий: " + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_DISTANCE;
        Collections.sort(vehicles);
        System.out.println("Кто дальше проехал: " + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_PRICE;
        Collections.sort(vehicles);
        System.out.println("Кто потратил меньше денег: " + vehicles.get(vehicles.size() -1 ).getClass().getName());
        allVehicles.add(vehicles.get(vehicles.size() -1 ));
        Collections.sort(allVehicles);
        Set<Vehicle> efficiency = new HashSet<>(allVehicles);
        for (Vehicle vehicle : efficiency) {
            System.out.print((Collections.frequency(allVehicles, vehicle) >= 2) ? "Эффективней "
                    + vehicle.getClass().getName() + ": "
                    + "привосходит по " + Collections.frequency(allVehicles, vehicle) + "-ом параметрам."
                    + "\n": "");
        }
    }
}

