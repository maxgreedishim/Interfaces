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
        System.out.println("Начальная скорость велосипеда: " + ((Vehicle)bike).getSpeed() + " км/ч");
        System.out.println("Грузоподъемность велосипеда: " + bike.showCarrying() + " кг");
        System.out.println(bike.honk() + "\n");
        System.out.println("Начальная скорость автомобиля : " + ((Vehicle)car).getSpeed() + " км/ч") ;
        System.out.println("Грузоподъемность автомобиля: " + car.showCarrying() + " кг");
        System.out.println(car.honk() + "\n");
        System.out.println("Начальная скорость грузовика : " + ((Vehicle)lorry).getSpeed() + " км/ч");
        System.out.println("Грузоподъемность грузовика: " + lorry.showCarrying() + " кг");
        System.out.println(lorry.honk() + "\n");

        for (int i = 0; i < 5; i++) {
            bike.speedUp();
            car.speedUp();
            lorry.speedUp();
            System.out.println(bike.showSpeed());
            System.out.println(car.showSpeed());
            System.out.println(lorry.showSpeed());
            bike.speedDown();
            car.speedDown();
            lorry.speedDown();
            System.out.println(bike.showSpeed());
            System.out.println(car.showSpeed());
            System.out.println(lorry.showSpeed() );
        }

            System.out.println("\n" +"About bike: ");
            if (bike instanceof Acсelerable == true) System.out.println("Велосипед наследует интерфейсу Accelerable");
            else System.out.println("Велосипед НЕ наследует интерфейсу Accelerable");
            if (bike instanceof Vehicle == true)System.out.println("Велосипед наследует класс Vehicle");
            else System.out.println("Велосипед НЕ наследует класс Vehicle");
            if (bike instanceof Car == true)System.out.println("Велосипед наследует класс Car");
            else System.out.println("Велосипед НЕ наследует класс Car");
            if (bike instanceof Runnable == true)System.out.println("Велосипед наследует класс Runnable" + "\n");
            else System.out.println("Велосипед НЕ наследует класс Runnable" + "\n");

            System.out.println("About car: ");
            if (car instanceof Acсelerable == true) System.out.println("Автомобиль наследует интерфейсу Accelerable");
            else System.out.println("Автомобиль НЕ наследует интерфейсу Accelerable");
            if (car instanceof Vehicle == true)System.out.println("Автомобиль наследует класс Vehicle");
            else System.out.println("Автомобиль НЕ наследует класс Vehicle");
            if (car instanceof Bike == true)System.out.println("Автомобиль наследует класс Bike");
            else System.out.println("Автомобиль НЕ наследует класс Car");
            if (car instanceof Runnable == true)System.out.println("Автомобиль наследует класс Runnable" + "\n");
            else System.out.println("Автомобиль НЕ наследует класс Runnable" + "\n");

            System.out.println("About lorry: ");
            if (lorry instanceof Acсelerable == true) System.out.println("Грузовик наследует интерфейсу Accelerable");
            else System.out.println("Грузовик НЕ наследует интерфейсу Accelerable");
            if (lorry instanceof Vehicle == true)System.out.println("Грузовик наследует класс Vehicle");
            else System.out.println("Грузовик НЕ наследует класс Vehicle");
            if (lorry instanceof Bike == true)System.out.println("Грузовик наследует класс Bike");
            else System.out.println("Грузовик НЕ наследует класс Car");
            if (lorry instanceof Runnable == true)System.out.println("Автомобиль наследует класс Runnable" + "\n");
            else System.out.println("Грузовик НЕ наследует класс Runnable" + "\n");

        for (Acсelerable v : vehicles){
            if (v instanceof Lorry == true) System.out.println("Обнаружен грузовик");
            if (v instanceof Car == true) System.out.println("Обнаружен автомобиль");
            if (v instanceof Bike == true) System.out.println("Обнаружен велосипед");
        }

    }
}
