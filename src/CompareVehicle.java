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


    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        List<Vehicle> allVehicles = new ArrayList<>();
        List<String> paragraph = new ArrayList<>();
        Vehicle bike = new Bike();
        Vehicle car = new Car();
        Vehicle lorry = new Lorry();
        vehicles.add(bike);
        vehicles.add(car);
        vehicles.add(lorry);
        paragraph.add("Самый быстрый: ");
        paragraph.add("Самый грузоподъемный: ");
        paragraph.add("Самый громкий: ");
        paragraph.add("Кто дальше проехал: ");
        paragraph.add("Кто потратил меньше денег: ");
        int average = paragraph.size()/2 + 1;


        Collections.sort(vehicles);
        System.out.println(paragraph.get(0) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_CARRYING;
        Collections.sort(vehicles);
        System.out.println(paragraph.get(1) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_LOUDNESS;
        Collections.sort(vehicles);
        System.out.println(paragraph.get(2) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_DISTANCE;
        Collections.sort(vehicles);
        System.out.println(paragraph.get(3) + vehicles.get(0).getClass().getName());
        allVehicles.add(vehicles.get(0));
        criterion = Criterion.BY_PRICE;
        Collections.sort(vehicles);
        System.out.println(paragraph.get(4) + vehicles.get(vehicles.size() -1 ).getClass().getName());
        allVehicles.add(vehicles.get(vehicles.size() -1 ));
        Collections.sort(allVehicles);

        /** List<Vehicle> allVehicles = new ArrayList<>() allVehicles в этот список попадают
         все учасники рейтинга столько раз, сколько они упоменаются.
         * Цыкл vehicle(с колличеством вхождений vehicles, обходит всех учасников рейтинга )
         * Collections.frequency считает колличество повторений в allVehicles, и если колличество >= average(
         среднее значение) то определяется лидер голосования, в противном случии выводится пустая строка */

        for (Vehicle vehicle : vehicles) {
            System.out.print((Collections.frequency(allVehicles, vehicle) >= average) ? "Эффективней "
                    + vehicle.getClass().getName() + ": "
                    + "превосходит по " + Collections.frequency(allVehicles, vehicle) + "-м параметрам."
                    + "\n": "");

        }
    }
}

