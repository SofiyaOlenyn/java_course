import arrayList.Simple;
import arrayList.SimpleArray;

public class Main {
    public static void main(String[] args){

        Simple<String> al = new SimpleArray<>();
        al.add("aa");
        al.add("bb");
        al.add("cc");
        System.out.println(al.get(1));
        al.delete(1);
        System.out.println(al.get(1));
    }
}
