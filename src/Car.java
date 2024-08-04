public class Car {
    private int price;
    private int engineSize;
    private int maxSpeed;
    private String color;

    public Car(int price, int engineSize, int maxSpeed,String color) {
        this.price = price;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
        this.color=color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
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
                "price=" + price +
                ", engineSize=" + engineSize +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
