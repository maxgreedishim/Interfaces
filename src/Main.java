public class Main {

    public static void main(String[] args) {
        Acсelerable bike = new Bike();
        Acсelerable car = new Car();
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
        }
    }
}
