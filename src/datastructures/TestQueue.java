package datastructures;

public class TestQueue {
    // Queue - FIFO
    int head;
    int tail;
    int[] arr;
    int size;
    int currSize;

    TestQueue(int size){
        arr = new int[size];
        // max size of our arr
        this.size = size;

        // num of elements currently in arr
        currSize = 0;

        // head and tail pointers:
        // head will start from beginning
        head = 0;
        // as we add values to arr, increment our tail pointer
        tail = -1;
    }
    // enqueue
    public void enqueue(int val){
        // move tail pointer up 1
        tail = (tail + 1) % size;

        // add the val to the arr
        arr[tail] = val;

        // increment our currSize
        currSize+= 1;
    }

    // dequeue
    public void dequeue(){
        // check to see whether our queue is already empty
        if (currSize == 0){
            System.out.println("Queue is already empty, can't dequeue");
        }

        // move head pointer up 1
        head = (head + 1) % size;

        currSize -=1;
    }


    // peek
    public int peek(){
        // returning where our head pointer is pointing to

        // thus we need to check whether our queue is empty
        if (currSize == 0){
            System.out.println("Queue is already empty, nothing to peek");
            return -999;
        }

        return arr[head];
    }

    public static void main(String[] args) {
        TestQueue t = new TestQueue(3);

    }
}
