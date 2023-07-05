public class QueueOfInts {
    private class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data; 
            this.next = next;
        }
    }

    Node head = null;
    Node tail = null;

    private Boolean isEmpty(){
        return (head == null);
    } 

    void enque(int data){
        if (head == null){
            head = new Node(data, null);
            tail = head;
        }

        tail.next = new Node(data, null);
        tail = tail.next;
    }

    void deque() throws Exception{
        if (isEmpty()) throw new Exception("The queue is empty");
        head = head.next;
        if (head == null) tail = null; 
    }

    void print(){
        Node tmp = head;
        while (tmp.next != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
