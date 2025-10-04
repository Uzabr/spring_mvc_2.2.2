package web.model;

public class Car {

    private String model;
    private int power;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, int power, int maxSpeed) {
        this.model = model;
        this.power = power;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
