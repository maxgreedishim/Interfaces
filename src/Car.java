class Car extends Vehicle implements Acсelerable {

    Car() {
        super(60, 300, "Бип - Бип");
    }

    @Override
    public void speedUp() {

        setSpeed(20);
    }

    @Override
    public void speedDown() {

        setSpeed(-20);
    }

    @Override
    public String showSpeed() {

        return "Скорость автомабиля: " + getSpeed();
    }

    @Override
    public String honk() {
        return "Сигнал автомобиля: " + getSignal();
    }

    @Override
    public int showCarrying() {
        return getCarrying();
    }
}
