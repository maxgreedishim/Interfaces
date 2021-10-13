import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Acсelerable> vehicles = new ArrayList<>();
        Acсelerable bike = new Bike();
        Acсelerable car = new Car();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(new Car());
        System.out.println("Начальная скорость велосипеда : " + ((Vehicle)bike).getSpeed());
        System.out.println("Начальная скорость автомобиля : " + ((Vehicle)car).getSpeed());

        for (int i = 0; i < 5; i++){
            bike.speedUp();
            car.speedUp();
            System.out.println(bike.showSpeed());
            System.out.println(car.showSpeed());
            bike.speedDown();
            car.speedDown();
            System.out.println(bike.showSpeed());
            System.out.println(car.showSpeed());
            System.out.println("About bike: ");
            System.out.println(bike instanceof Acсelerable);
            System.out.println(bike instanceof Vehicle);
            System.out.println(bike instanceof Car);
            System.out.println(bike instanceof Runnable);
            System.out.println("About car: ");
            System.out.println(car instanceof Acсelerable);
            System.out.println(car instanceof Vehicle);
            System.out.println(car instanceof Bike);
        }
        for (Acсelerable v : vehicles){
            System.out.println("Обнаружен " + (v instanceof Car ? "автомобиль" : "велосипед"));
        }

    }
}
