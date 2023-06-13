import java.util.ArrayList;

public class ArrayListExample {

    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(39);
        list.add(400);
        list.add(43);
        System.out.println(list);
        list.set(1,4);
        System.out.println(list);
    }    
}
 