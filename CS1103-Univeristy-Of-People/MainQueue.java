public class MainQueue {
    public static void main(String[] args) {
        QueueOfInts q1 = new QueueOfInts();

        q1.enque(43);
        q1.print();
        try {
            q1.deque();
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
        q1.enque(3);
        q1.print();
    }
}
