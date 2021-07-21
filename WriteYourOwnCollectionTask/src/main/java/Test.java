import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayListWithoutEdit<String> list = new ArrayListWithoutEdit<String>();
        list.add("Mango");
        list.add("Apple");
        System.out.println(list.get(1));
//        System.out.println(list.remove(1));

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(1);
        list2.add(5);
        list2.add(-2);
        list2.add(3);
        list2.add(5);
        list2.add(5);
        list2.add(1);
        MapStructure<Integer> map = new MapStructure<>(list2);
        map.print();
    }
}
