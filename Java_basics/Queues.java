class customqueue {
    private int front, rear, capacity;
    private int queue[];

    customqueue(int c) {
        front = rear = 0;
        capacity = c;
        queue = new int[capacity];
    }

    // insertion
    void queueEnqueue(int data) {
        if (rear == capacity) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear++] = data; // rear = rear + 1
    }

    // deletion
    void queueDequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }

        int popped = queue[front];

        for (int i = 0; i < rear - 1; i++) {
            queue[i] = queue[i + 1];
        }
        rear--;
        System.out.println("Popped element is " + popped);
    }

    // display
    void queueDisplay() {
        if (front == rear) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Queue Elements");
        for (int i = front; i < rear; i++) {
            System.out.print(" <-- " + queue[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        customqueue q = new customqueue(4);

        q.queueEnqueue(60);
        q.queueEnqueue(50);
        q.queueEnqueue(40);
        q.queueDisplay();
        q.queueDequeue();
        q.queueDisplay();
    }
}