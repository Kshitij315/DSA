package LinkedList;

import java.util.Scanner;

public class CircularLinkedList {
    public class Node {
        int data;
        Node next;//self ref structure

        Node(int data) {
            this.data = data;
            this.next = null;//next=null;
        }
    }

    Node root;
    Node last;

    void create_list() {
        root =last= null;//root is not there
    }

    void insert_left(int e) {
        Node n = new Node(e);
        if (root == null) {//not there then n is root
            root = last = n;
            last.next = root;
        }//refer to same node
        else {
            n.next = root;//1
            root = n;//2
            last.next=root;
        }
        System.out.println(e + " inserted");

    }

    void insert_right(int e) {
        Node n = new Node(e);//created
        if (root == null) {//not there then n is root
            root = last = n;
            last.next = root;
        }
        else {
            last.next=n;
            last=n;
            last.next=root;
        }
        System.out.println(e + " inserted");
    }

    void delete_left() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        if(root==last){//single node
            Node t=root;
            root=last=null;
            System.out.println(t.data+"deleted");
        }
        else {
            Node t = root;//1
            root = root.next;//2
            last.next=root;//3
            System.out.println(t.data + " deleted");
        }
    }

    void delete_right() {
        if(root==null)//not there then n is root
            System.out.println("Empty list");
        else
        {
            Node t=root;//1
            Node t2=t;//1
            while(t.next!=root)//2
            {
                t2=t;
                t=t.next;
            }
            if (t==root)//one node only
            { root=last=null;}
            else {
                last=t2;//
                last.next = root;//3
            }
            System.out.println(t.data+" deleted");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node t = root;//1
            do {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
            while (t != root) ;


        }
    }
    public static void main(String args[])
    {
        int ch,e;
        Scanner in = new Scanner(System.in);
        CircularLinkedList obj = new CircularLinkedList();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
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
                case 5:
                    obj.print_list();
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
