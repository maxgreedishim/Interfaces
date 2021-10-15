import java.util.Comparator;
class Vehicle implements Comparable<Vehicle>{
    private double speed;
    private int carrying;
    private String signal;



    Vehicle(int speed, int carrying, String signal) { // int в double можно превращать
        this.speed = speed;
        this.carrying = carrying;
        this.signal = signal;
    }


    int getCarrying(){
        return (carrying);
    }
    String getSignal(){
        return signal;
    }

    int getSpeed() {

        return (int)Math.round(speed);
    }

    public void setSpeed(double speed) {
        if (speed > 100 || speed <= 0) return;
        this.speed += speed * Math.random();

    }

    /*@Override
    public int compare(Vehicle v1, Vehicle v2) {
    // пользуемся готовым методом Integer.compare
        return Integer.compare(v1.getCarrying(), v2.getCarrying());
    }*/

    @Override
    public int compareTo(Vehicle v) {

        return switch (CompareVehicle.criterion){
            case BY_SPEED -> Integer.compare((int) Math.round(v.speed), (int) Math.round(this.speed));
            case BY_CARRYING -> Integer.compare(v.getCarrying(), this.getCarrying());
            case BY_LOUDNESS -> Integer.compare(v.getSignal().length(), this.getSignal().length());
        };
    }
}
