package mod11;
class QueueArray {
    int max = 5;
    int[] queue = new int[max];
    int front = 0, rear = -1;

    void enqueue(int x) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow");
        } else {
            queue[++rear] = x;
            System.out.println(x + " inserted");
        }
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println(queue[front++] + " removed");
        }
    }

    void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.display();
    }
}