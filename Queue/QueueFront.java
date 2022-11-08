package Queue;

public class QueueFront {

    int queue[]; // array to store the queue elements
    int front; // front end index
    int rear; // rear end index
    int capacity; // how many elements a queue can contain

    QueueFront(int size) {
        queue = new int[size]; // [0, , , , , , ]
        capacity = size;// rf
        front = 0;
        rear = 0;
    }
    // enqueue - constant
    // dequene - linear costly

    // [7,2,1,2,3,4, ]
    // 0 1 2 3 4 5 6
    // f
    // r
    public void enqueue(int data) {

        if (rear == capacity) {
            System.out.println("No place to enqueue");
            return;
        }

        queue[rear] = data;
        rear++;
    }
    // 0 1 2 3
    // 6 7 8 9 11 0 0
    // f r

    //

    public int dequeue() {

        // corner
        if (front == rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        int dequeueElement = queue[front];// 4

        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;

        return dequeueElement;
    }

    public void print() {
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueFront queue = new QueueFront(7);

        queue.enqueue(7);// add
        queue.enqueue(2);
        queue.enqueue(11);
        queue.enqueue(9);
        queue.enqueue(5);

        queue.print();
        System.out.println(queue.dequeue());// remove//7
        System.out.println(queue.dequeue());// remove //2

        queue.enqueue(100);
        queue.enqueue(333);
        queue.print();
        System.out.println(queue.dequeue());

        queue.print();

    }
}
