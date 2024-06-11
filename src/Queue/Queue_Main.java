package Queue;

import java.util.Scanner;

public class Queue_Main {
    public static void main(String args[])
    {
        int ch;
        Scanner in=new Scanner(System.in);
//        LinearQueue  obj=new LinearQueue ();
        CircularQueue obj=new CircularQueue();
        System.out.println("Enter size of queue:");
        int size=in.nextInt();
        obj.create_queue(size);//user given size :stack
        do
        {
            System.out.println("1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    if(!obj.is_full())//if not full then take data
                    {
                        System.out.println("Enter data to insert:");
                        int e=in.nextInt();
                        obj.enqueue(e);
                        System.out.println("Data to enqueued");
                    }
                    else {
                        System.out.println("Queue Full");
                    }
                    break;
                case 2:
                    if(!obj.is_empty())//if not Empty then dequeue
                    {
                        int e=obj.dequeue();
                        System.out.println("Data dequeued:"+e);
                    }
                    else
                    {
                        System.out.println("Queue Empty");
                    }
                    break;
                case 3:
                    if(!obj.is_empty())//if not Empty then print
                    {
                        System.out.println("Data in queue");
                        obj.print_queue();
                    }
                    else
                    {
                        System.out.println("Queue Empty");
                    }
                    break;
                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);
    }

}
