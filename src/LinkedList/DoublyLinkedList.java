package LinkedList;

import java.util.Scanner;

public class DoublyLinkedList {

    public class DNode {
        int data;
        DNode right;//self ref structure
        DNode left;
        DNode(int data) {
            this.data = data;
            this.right=this.left= null
            ;//next=null;
        }

    }
    DNode root;

    void create_list()
    {
        root=null;//root is not there
    }
    void insert_left(int e)
    {
        DNode n=new DNode(e);
        if(root==null)//not there then n is root
            root=n;
        else
        {
            n.right=root;//1
            root.left=n;//2
            root=n;//3
        }
        System.out.println(e+" inserted");

    }
    void insert_right(int e)
    {
        DNode n=new DNode(e);//created
        if(root==null)//not there then n is root
            root=n;
        else
        {
            DNode t=root;//1
            while(t.right!=null)//2
                t=t.right;
            t.right=n;//3
            n.left=t;//4
        }
        System.out.println(e+" inserted");
    }

    void delete_left()
    {
        if(root==null)//not there then n is root
            System.out.println("Empty list");
        else
        {
            DNode t=root;//1
            if(root.left==null && root.right==null)
                root=null;
            else {
                root = root.right;//2
                root.left = null;//3
            }
            System.out.println(t.data+" deleted");

        }
    }
    void delete_right()
    {
        if(root==null)//not there then n is root
            System.out.println("Empty list");
        else
        {
            DNode t=root;//1
            while(t.right!=null)//2
                t=t.right;
            if(root.left==null && root.right==null)
                root=null;
            else
            {
                DNode t2 = t.left;
                t2.right = null;//3
            }
            System.out.println(t.data+" deleted");

        }
    }
    void print_list()
    {  if(root==null)
        System.out.println("Empty list");
    else
    {
        DNode t=root;//1
        while(t!=null)
        {
            System.out.print("<-|"+t.data+"|->");
            t=t.right;
        }
    }
    }
    void print_list_rev() {
        if (root == null)
            System.out.println("Empty list");
        else
        {
            DNode t=root;//1
            while(t!=null)
            {
                System.out.print("<-|"+t.data+"|->");
                t=t.right;
            }
        }

    }
    public static void main(String args[]) {
        int ch, e;
        Scanner in = new Scanner(System.in);
        DoublyLinkedList obj = new DoublyLinkedList();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Print Reverse\n0.Exit\n:");
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
