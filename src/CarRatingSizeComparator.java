import java.util.Comparator;

public class CarRatingSizeComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getRating() - o2.getRating();
    }
}
