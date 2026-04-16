import java.util.Scanner;

public class CircularQueue {

    int arr[] = new int[5];
    int front = -1, rear = -1;
    int size = 5;

    // Enqueue
    void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue is Full");
        } 
        else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = value;
            System.out.println(value + " inserted");
        }
    }

    // Dequeue
    void dequeue() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } 
        else {
            System.out.println(arr[front] + " deleted");

            if (front == rear) {
                front = rear = -1;
            } 
            else {
                front = (front + 1) % size;
            }
        }
    }

    // Display
    void display() {
        if (front == -1) {
            System.out.println("Queue is Empty");
        } 
        else {
            System.out.print("Queue: ");
            int i = front;

            while (true) {
                System.out.print(arr[i] + " ");
                if (i == rear) break;
                i = (i + 1) % size;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CircularQueue q = new CircularQueue();
        int choice;

        do {
            System.out.println("\n1.Enqueue  2.Dequeue  3.Display  4.Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    q.enqueue(val);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.display();
                    break;

                case 4:
                    System.out.println("Program End");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
