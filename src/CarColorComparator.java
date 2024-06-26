import java.util.Comparator;

/**
 * @author: Vijaysurya Mandala
 * @github: github/mandalavijaysurya (<a href="https://www.github.com/mandalavijaysurya"> Github</a>)
 */
public class CarColorComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2){
        return o1.getColor().compareTo(o2.getColor());
    }
}
