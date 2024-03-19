import java.util.Comparator;

public class maxSpeed implements Comparator<Car> {
    public int compare(Car o1, Car o2){
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}
