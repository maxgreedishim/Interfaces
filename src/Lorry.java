public class Lorry extends Vehicle implements Acсelerable{
    public Lorry() {
        super(30,20000,"Фа-Фа");
    }

    @Override
    public void speedUp() {
        setSpeed(30);
    }

    @Override
    public void speedDown() {
        setSpeed(-30);
    }

    @Override
    public String showSpeed() {
            return "Скорость грузовика: " + getSpeed();

    }

    @Override
    public String honk() {
        return "Сигнал грузовика: " + getSignal();
    }

    @Override
    public int showCarrying() {
        return getCarrying();
    }
}
