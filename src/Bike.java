class Bike extends Vehicle implements Acсelerable, Runnable{

    Bike() {
        super(15,20, "Дзынь - Дзынь");
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
    public String honk() {
        return "Сигнал велосипеда: " + getSignal();
    }

    @Override
    public int showCarrying() {
        return getCarrying();
    }

    @Override
    public void run() {

    }
}
