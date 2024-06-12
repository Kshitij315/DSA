package LinkedList;

import java.util.Scanner;

public class DynamicStack {


    Node tos;
    public class Node {
        int data;
        Node next;//self ref structure

        Node(int data) {
            this.data = data;
            this.next = null;//next=null;
        }
    }


    void create_list() {
        tos = null;//root is not there
    }

    void push(int e) {
        Node n = new Node(e);
        if (tos == null)//not there then n is root
            tos = n;
        else {
            n.next = tos;//1
            tos = n;//2
        }
        System.out.println(e + "Pushed");

    }

    void pop() {
        if (tos == null)//not there then n is root
            System.out.println("Empty Stack");
        else {
            Node t = tos;//1
            tos = tos.next;//2
            System.out.println(t.data + " popped");
        }
    }

    void peek() {
        if (tos == null)
            System.out.println("Empty Stack");
        else {
            System.out.println(tos.data+ " @peek");
        }
    }

    void print_stack() {
        if (tos == null)
            System.out.println("Empty Stack");
        else {
            Node t = tos;//1
            while (t != null) {
                System.out.print("|" + t.data + "|");
                System.out.println("-----------------");
                t=t.next;
            }
        }


    }
    public static void main(String[] args)
    {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Linked_List obj = new Linked_List();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter a number");
                    e = in.nextInt();
                    obj.insert_left(e);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_right(e);
                    break;
                case 3:
                    obj.delete_left();
                    break;
                case 4:
                    obj.delete_right();
                    break;



                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}
