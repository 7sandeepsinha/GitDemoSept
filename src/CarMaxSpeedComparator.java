import java.util.Comparator;

public class CarMaxSpeedComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getMaxSpeed() == o2.getMaxSpeed()) return 0;
        else if (o1.getMaxSpeed() < o2.getMaxSpeed()) return -1;
        return 1;
    }
}
