class Vehicle {
    private double speed;

    Vehicle(int speed) { // int в double можно превращать
        this.speed = speed;
    }

    int getSpeed() {
        return (int)Math.round(speed);
    }

    public void setSpeed(double speed) {
        if (speed > 100) return;
        this.speed += speed * Math.random();

    }
}
