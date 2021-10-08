class Car extends Vehicle implements Acсelerable {
    Car() {
        super(60);
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
        return "Скорость автомабиля: " + this.getSpeed();
    }
}
