import java.util.*;
import java.lang.Integer;

public class MapStructure<E> {

    private Map<E, Integer> values = new HashMap<>();

    public MapStructure(ArrayList<E> array) {

        List<E> list = array;

        for (E e : list) {
            if (values.containsKey(e)) {
                values.put(e, values.get(e) + 1);
            } else {
                values.put(e, 1);
            }
        }
    }

    public void print() {
        Set<Map.Entry<E, Integer>> entrySet = values.entrySet();
        for (Map.Entry<E, Integer> e : entrySet) {
            System.out.printf("%s : %d %n ", e.getKey(), e.getValue());
        }

    }

    public Map<E, Integer> getValues() {
        return values;
    }

    public int size() {
        return values.size();
    }

}
