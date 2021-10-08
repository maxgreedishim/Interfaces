class Bike extends Vehicle implements Acсelerable{

    Bike() {
        super(15);
    }

    @Override
    public void speedUp() {
        this.setSpeed(5);
    }

    @Override
    public void speedDown() {
        this.setSpeed(-5);
    }

    @Override
    public String showSpeed() {
        return "Скорость велосипеда: " + this.getSpeed();
    }
}
