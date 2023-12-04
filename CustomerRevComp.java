package CS102_PROJECT;

import java.util.Comparator;
import java.util.Map;

public class CustomerRevComp implements Comparator<Map.Entry<String, Double>> {
    // found online (from stackoverflow)

    
    public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
       return o2.getValue().compareTo(o1.getValue());
    }
}
