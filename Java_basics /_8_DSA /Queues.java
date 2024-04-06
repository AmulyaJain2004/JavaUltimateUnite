class Queues{ int front, rear, capacity; int queue[];

customqueue(int c){  //constructor
    front = rear = 0;
    capacity = c;
    queue = new int[capacity];
}

//insertion
void queueEnqueue(int data){
    if(rear == capacity)
    System.out.println("Queue is full");
    queue[rear++]=data; //rear = rear + 1
}

void queueDequeue(){  //deletion
    if(front == rear)
        System.out.println("Queue is empty");
    
    int popped = queue[front];
    
    for(int i = 0; i<rear-1; i++){
        queue[i] = queue[i+1];
    }
    rear--;
    System.out.println("Popped element is "+popped);
}

void queueDisplay(){ if(front == rear){ System.out.println("Queue is Empty"); } System.out.println("Queue Elements"); for(int i = front ; i<rear; i++){ System.out.print(" <-- "+queue[i]); } }

public static void main(String[]args){
     customqueue q = new customqueue(4);
     
     q.queueEnqueue(60);
     q.queueEnqueue(50);
     q.queueEnqueue(40);
     q.queueDisplay();
     q.queueDequeue();
     q.queueDisplay();
}
}
