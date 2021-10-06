public class MainClass {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        System.out.println(stack.peek());
        stack.displayStack();
        stack.pop();
        stack.pop();
        stack.displayStack();



    }
}