import java.util.*;

enum Criterion {
     BY_SPEED,
     BY_CARRYING,
     BY_LOUDNESS,
     BY_DISTANCE,
     BY_PRICE,

}
/** Класс служит для определения эффективности по характиристикам
 @author Maxgreed
 @version 1.0
 */
public class CompareVehicle {
    /** Поле среднее значение */
    private static int average;
    /** Поле значение по умолчанию */
    static Criterion criterion = Criterion.BY_SPEED;

    /**
     * @param args
     * allVehicles в этот список попадают все учасники рейтинга столько раз, сколько они упоменаются.
     * Цыкл vehicle(с колличеством вхождений vehicles, обходит всех учасников рейтинга)
     * Collections.frequency считает колличество повторений в allVehicles, и если колличество >= average
     * (среднее значение) то определяется лидер голосования, в противном случии выводится пустая строка
     */
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> allVehicles = new ArrayList<>();
        List<String> items = new ArrayList<>();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle lorry = new Lorry();
        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(lorry);
        items.add("Самый быстрый: ");
        items.add("Самый грузоподъемный: ");
        items.add("Самый громкий: ");
        items.add("Кто дальше проехал: ");
        items.add("Кто потратил меньше денег: ");

        Collections.sort(vehicles);
        System.out.println(items.get(0) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_CARRYING;
        Collections.sort(vehicles);
        System.out.println(items.get(1) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_LOUDNESS;
        Collections.sort(vehicles);
        System.out.println(items.get(2) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_DISTANCE;
        Collections.sort(vehicles);
        System.out.println(items.get(3) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_PRICE;
        Collections.sort(vehicles);
        System.out.println(items.get(4) + vehicles.get(vehicles.size() -1 ).getClass().getName());
        allVehicles.add(vehicles.get(vehicles.size() -1 ));
        Collections.sort(allVehicles);
        average = items.size()/2 + 1;

        for (Vehicle vehicle : vehicles) {
            System.out.print((Collections.frequency(allVehicles, vehicle) >= average) ? "Эффективней "
                    + vehicle.getClass().getName() + ": "
                    + "превосходит по " + Collections.frequency(allVehicles, vehicle) + "-м параметрам."
                    + "\n": "");
        }
    }
}

