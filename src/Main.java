import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car class demo");
        Car c1 = new Car(100000,1200, 80, false);
        Car c2 = new Car(200000,1000, 100,true);
        Car c3 = new Car(300000,800, 120,true);
        Car c4 = new Car(400000,600, 140,false);
        List<Car> carList = new ArrayList<>(Arrays.asList(c2, c1, c4, c3));
        carList.sort(new CarPriceComparator());
        System.out.println(carList);
    }
}