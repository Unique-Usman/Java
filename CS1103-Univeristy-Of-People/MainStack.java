import java.util.EmptyStackException;

public class MainStack {
    public static void main(String[] args) {
        StackOfInts s1 = new StackOfInts();
        s1.push(3);
        s1.push(3);
        s1.print();
        s1.pop();
        System.out.println("After poping out and array");
        // s1.print();
        s1.push(7);
        s1.print();

        StackOfIntsArray s2 = new StackOfIntsArray();

        try {
            s2.push(20);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        s2.print();
    }
}
