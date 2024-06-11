package Queue;

public class CircularQueue {

    int q[], maxsize, front, rear, count;

    void create_queue(int size) {
        maxsize = size;
        front = 0;
        rear = -1;
        count = 0;
        q = new int[maxsize];
    }

    void enqueue(int e) {
        //q[++rear]=e;
        rear = (rear + 1) % maxsize;
        count++;//changes
        q[rear] = e;
    }

    boolean is_full() {
        if (count == maxsize)
            return true;
        else
            return false;
    }

    int dequeue() {
        int temp = q[front];
        front = (front + 1) % maxsize;
        count--;
        return temp;
    }

    boolean is_empty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    void print_queue() {
        int c = 0;
        int i = front;
        while (c < count) {
            System.out.print(q[i] + "--");
            i = (i + 1) % maxsize;
            c++;
        }
    }
}
