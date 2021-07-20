import arrayList.Simple;
import arrayList.SimpleArray;
import linkedList.Linked;
import linkedList.LinkedContainer;

public class Main {
    public static void main(String[] args){

        Simple<String> al = new SimpleArray<>();
        al.add("aa");
        al.add("bb");
        al.add("cc");
        System.out.println(al.get(1));
        al.delete(1);
        System.out.println(al.get(1));
        System.out.println("////////////////////");
        Linked<String> lc = new LinkedContainer<>();
        lc.addFirst("aa");
        lc.addFirst("bb");
        lc.addLast("cc");
        System.out.println(lc.getElementByIndex(0));
        System.out.println(lc.getElementByIndex(2));

    }
}
