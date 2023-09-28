public class Stack {
    /* the array implementation to store the elements of the stack */
    public static int[] stack = new int[3];

    /* pointer to that points to the top element in the stack */
    public static int top = -1;

    /* pointer that specifies the size of the stack */
    public static int size = 3;

    /* method to check if the stack is empty */
    public static boolean isEmpty() {
        return top == -1;
    }

    public static boolean isFull() {
        return top == size - 1;
    }

    /* method that pops an element from the stack */
    public static int pop() throws Exception {
        if (isEmpty())
            throw new Exception("Stack is empty, there is nothing to remove");
        else {
            int ele = stack[top];
            top--;
            return ele;
        }
    }

    /* method to push onto the top of the stack */
    public static void push(int data) throws Exception {
        if (isFull())
            throw new Exception("Stack is full, you cannot add");
        else {
            top++;
            stack[top] = data;
        }
    }

    public static void main(String[] args) {
        /* Initialize the stack with zeros */
        try {
            push(0);
            push(1);
            push(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /* Simulate inspections at three stations */
        try {
            System.out.println("Inspection at station 1: Pop " + pop());
            System.out.println("Inspection at station 2: Pop " + pop());
            System.out.println("Inspection at station 3: Pop " + pop());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

