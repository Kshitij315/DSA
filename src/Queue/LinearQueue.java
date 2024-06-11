package Queue;

public class LinearQueue {
    int q[],maxsize,front,rear;
    void create_queue(int size)
    {
        maxsize=size;
        front=0;
        rear=-1;
        q=new int[maxsize];
    }
    void enqueue(int e)
    {
        //q[++rear]=e;
        rear++;
        q[rear]=e;
    }

    boolean is_full()
    {
        if(rear==maxsize-1)
            return true;
        else
            return false;
    }

    int dequeue()
    {
        int temp=q[front];
        front++;
        return temp;
    }
    boolean is_empty()
    {
        if(front>rear)
            return true;
        else
            return false;
    }
    void print_queue()
    {
        for(int i=front;i<=rear;i++)
            System.out.print(q[i]+"--");
    }
}
