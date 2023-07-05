
import java.util.EmptyStackException;
public class StackOfIntsArray {

    //Node class
    private class Node{
        int data;
        Node next;
        public Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }
    //new exception class to simulate when the stack is full
    private class FullStackException extends Exception {
        FullStackException(String message) {
            super(message);
        }

        @Override
        public String getMessage() {
            return super.getMessage();
        }
    }

    //static elements needed for the array. 
    static Node head = null;
    static int size = -1;
    static int[] arr = new int[5];
    static int top = 0;
    static int N = 5;

    private Boolean isEmpty(){
        return (size == -1);
    }
    private Boolean isFull(){
        return (size == N - 1);
    }

    void push(int data) throws FullStackException{
        if (isFull()) throw new FullStackException("The Stack is full");
        arr[++size] = data;
    }

    void pop() throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException();
        size--;
    }


    void print() throws EmptyStackException{
        if (isEmpty()) throw new EmptyStackException();
        int tmp = size;
        for (int i = 0; i <= tmp; i++){
            System.out.println(arr[i]);
        }
    }
}
