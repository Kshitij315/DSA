package Queue;

public class PriorityQueue {
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
        for(int i=front;i<rear;i++) {
            for (int j = front; j < rear; j++) {
                if(q[j]>q[j+1])
                {
                    int temp=q[j];
                    q[j]=q[j+1];
                    q[j+1]=temp;
                }

            }
        }
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
