class Bike extends Vehicle implements Acсelerable, Runnable{

    Bike() {
        super(15);
    }

    @Override
    public void speedUp() {

        setSpeed(5);
    }

    @Override
    public void speedDown() {

        setSpeed(-5);
    }

    @Override
    public String showSpeed() {
        return "Скорость велосипеда: " + getSpeed();
    }

    @Override
    public void run() {

    }
}
