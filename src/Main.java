import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Acсelerable> vehicles = new ArrayList<>();
        Acсelerable bike = new Bike();
        Acсelerable car = new Car();
        Acсelerable lorry = new Lorry();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(lorry);
        vehicles.add(new Car());
        System.out.println("Начальная скорость велосипеда: " + ((Vehicle)bike).getSpeed() + " км/ч");
        System.out.println("Грузоподъемность велосипеда: " + bike.showCarrying() + " кг");
        System.out.println(bike.honk() + "\n");
        System.out.println("Начальная скорость автомобиля : " + ((Vehicle)car).getSpeed() + " км/ч") ;
        System.out.println("Грузоподъемность автомобиля: " + car.showCarrying() + " кг");
        System.out.println(car.honk() + "\n");
        System.out.println("Начальная скорость грузовика : " + ((Vehicle)lorry).getSpeed() + " км/ч");
        System.out.println("Грузоподъемность грузовика: " + lorry.showCarrying() + " кг");
        System.out.println(lorry.honk() + "\n");

        for (int i = 0; i < 5; i++){
            bike.speedUp();
            car.speedUp();
            lorry.speedUp();
            System.out.println(bike.showSpeed());
            System.out.println(car.showSpeed());
            System.out.println(lorry.showSpeed());
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
