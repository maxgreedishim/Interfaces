class Vehicle implements Comparable<Vehicle>{

    private double speed;
    private int carrying;
    private String signal;
    private int refueling;
    private double consumption;
    private int priceOneLiter;



    Vehicle(int speed, int carrying, String signal, int refueling, double consumption,int priceOneLiter) { // int в double можно превращать
        this.speed = speed;
        this.carrying = carrying;
        this.signal = signal;
        this.refueling = refueling;
        this.consumption = consumption;
        this.priceOneLiter = priceOneLiter;
    }

    int getCarrying() {
        return (carrying);
    }

    String getSignal() {
        return signal;
    }

    int getSpeed() {

        return (int)Math.round(speed);
    }

    public void setSpeed(double speed) {
        if (speed > 100 || speed <= 0) return;
        this.speed += speed * Math.random();
    }
    double getRefueling(){
        return refueling;
    }

    double getShowDistance(){
        return (100 / consumption) * getRefueling();
    }
    int getPrice () {
        return priceOneLiter * refueling;
    }
    /*int getEfficiency () {
        return ;
    }*/

    @Override
    public int compareTo(Vehicle v) {

        return switch (CompareVehicle.criterion){
            case BY_SPEED -> Integer.compare((int) Math.round(v.speed), (int) Math.round(this.speed));
            case BY_CARRYING -> Integer.compare(v.getCarrying(), this.getCarrying());
            case BY_LOUDNESS -> Integer.compare(v.getSignal().length(), this.getSignal().length());
            case BY_DISTANCE -> Double.compare(v.getShowDistance(), this.getShowDistance());
            case BY_PRICE -> Integer.compare(v.getPrice(), this.getPrice());
            
        };
    }
}
