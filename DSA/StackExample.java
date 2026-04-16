public class StackExample {

    static int max = 5;
    static int stack[] = new int[max];
    static int top = -1;

    // Push operation
    public static void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println(value + " pushed");
        }
    }

    // Pop operation
    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println(stack[top] + " popped");
            top--;
        }
    }

    // Peek operation
    public static void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    // Display stack
    public static void display() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        push(10);
        push(20);
        push(30);

        display();

        pop();
        peek();
    }
}