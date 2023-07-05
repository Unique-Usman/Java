import java.util.EmptyStackException;

public class StackOfInts {
    private class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

    static Node head = null;
    static int size = 0;

    private Boolean isEmpty(){
        //check for the size
        return (size == 0);
    }

    void push(int data){
        Node tmp = head;
        if (size == 0)
        {
            head = new Node(data, null);
            size++;
            return;
        }
        while (tmp.next!= null){
            tmp = tmp.next;
        }  
        tmp.next = new Node(data, null);
        size++;
    }

    void pop() throws EmptyStackException{
        Node tmp = head;
            if (tmp == null) throw new EmptyStackException();
            if (tmp.next == null){
                head  = null;
                size--;
                return;
            }
            while (tmp.next.next != null){
                tmp = tmp.next;
            }   
            tmp.next= null;
            size--;
    }
    void print(){
        Node tmp = head;

        while (tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }
}
