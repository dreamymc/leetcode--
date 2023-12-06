import java.util.*;

public class newClass {
    public static void main(String[] args) {
        // Make a collection
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove(1);
        Iterator<String> it = cars.iterator();

        while (it.hasNext())
            System.out.println(it.next());
    }
}
