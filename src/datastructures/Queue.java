package datastructures;

public class Queue {
    int[] arr;
    int size;
    int currSize;

    int head;
    int tail;

    Queue(int size){
        arr = new int[size];
        this.size = size;
        currSize = 0;

        head = 0;
        tail = -1;
    }

    // remove
    public void dequeue(){
        if (currSize == 0){
            System.out.println("Queue already empty");
            return;
        }

        // mod size is to make the queue "circular"
        head = (head + 1) % size;

        currSize--;
    }

    // add
    public void enqueue(int item){
        if (currSize == size){
            System.out.println("Queue full");
            return;
        }

        // mod size is to make the queue "circular"
        tail = (tail + 1) % size;

        arr[tail] = item;
        currSize++;
    }

    public int peek(){
        if (currSize == 0){
            System.out.println("Queue already empty");
            return -999;
        }

        return arr[head];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.enqueue(4);
        queue.dequeue();

        queue.enqueue(5);

        queue.peek();
    }
}