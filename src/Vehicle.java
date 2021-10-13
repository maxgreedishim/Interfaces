class Vehicle {
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
        if (speed > 100) return;
        this.speed += speed * Math.random();

    }
}
