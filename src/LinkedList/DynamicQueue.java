package LinkedList;

import java.util.Scanner;

public class DynamicQueue {


    public class Node {
        int data;
        Node next;//self ref structure

        Node(int data) {
            this.data = data;
            this.next = null;//next=null;
        }
    }

    Node front;
    Node rear;

    void create_queue() {
        rear=front = null;//root is not there
    }

    void dequeue() {

        if(front==null)//
            System.out.println("Empty Queue");
        else
        {
            Node t=front;//1
            //single node case
            if(front==rear)
                front=rear=null;
            else
                front=front.next;//2
            System.out.println(t.data+" dequeued");
        }
    }

    void enqueue(int e) {
        Node n=new Node(e);//created
        if(rear==null)//not there then n is root
        { rear=front=n;}
        else
        {
            rear.next=n;
            rear=n;
            System.out.println(e+" Enqueued");
        }
    }
    void print_queue()
    {  if(front==null)
        System.out.println("Empty queue");
    else
    {
        Node t=front;//1
        while(t!=null)
        {
            System.out.print("|"+t.data+"|-");
            t=t.next;
        }
    }
    }
    public static void main(String args[])
    {
        int ch;
        Scanner in=new Scanner(System.in);
        DynamicQueue obj=new DynamicQueue();
        obj.create_queue();//user given size :stack
        do
        {
            System.out.println("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter data to insert:");
                    int e=in.nextInt();
                    obj.enqueue(e);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    System.out.println("Data in queue");
                    obj.print_queue();
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


