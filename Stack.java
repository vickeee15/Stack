import java.util.EmptyStackException;

public class Stack {
    public Node top;
    public int size;
    public void push(int data) {

        Node tempNode = new Node(data);
        tempNode.next = top;
        top  = tempNode;
        size++;

    }

    public int pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        int result = top.data;
        top = top.next;
        size--;
        return result;
    }

    public int peek() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }
    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void displayStack() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data+" ");

            current = current.next;
        }

    }
}
