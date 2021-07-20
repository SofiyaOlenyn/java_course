import java.util.ArrayList;

public class Test {

    public static void main(String[] args){

        ArrayListWithoutEdit<String> list=new ArrayListWithoutEdit<String>();//Creating arraylist
        list.add("Mango");//Adding object in arraylist
        list.add("Apple");
        System.out.println(list.get(1));
        System.out.println(list.remove(1));

//        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
//        list.add("Mango");//Adding object in arraylist
//        list.add("Apple");
//        list.add("Banana");
//       // list.add("Mango");
//        list.add("Grapes");
//
//        MapStructure<String> map = new MapStructure<>(list);
//        map.print();
    }
}
