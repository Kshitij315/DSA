package LinkedList;

public class CircularDoublyLinkedList {

    class Dnode{
        int data;
        Dnode right,left;

        Dnode(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    Dnode root,last;


    void  create_list()
    {
        root=null;
        last=null;
    }

    void insert_left(int value)
    {
        Dnode node = new Dnode(value);//creating new node
        if(root==null && last==null)// node doesn't exists
        {
            root=last=node;
            root.right=last;
            last.left=root;
        }
        else
        {
            node.right= root;
            node.left= last;
            root.left= node;
            last.right = node;
            root= node;
        }
        System.out.println(value + "is Inserted");
    }

    void delete_left()
    {
        if (root==null && last == null)
        {
            System.out.println("Empty list");
        }
        else
        {
            Dnode t = root;
            if(root==last)
            {
                root=null;
                last=null;
            }
            else
            {
                root=t.right;
                root.left=last;
                last.right=root;
            }
            System.out.println(t.data+ " is deleted" );
        }
    }

    void insert_right(int value)
    {   Dnode node = new Dnode(value);
        if(root==null && last==null)
        {
            root=last=node;
            last.right=root;
            root.left=last;
        }
        else {
            node.right=root;
            node.left=last;
            last.right=node;
            last=node;
            root.left=node;
        }
        System.out.println(value + "Inserted");
    }

    void delete_right()
    {
        if(root==null && last==null)
        {
            System.out.println("Empty list");
        }
        else
        {
            Dnode t=last;
            if(last==root)
            {
                root=null;
                last=null;
            }
            else
            {
                last=t.left;
                last.right=root;
                root.left=last;
            }
            System.out.println(t.data+" is Deleted");
        }
    }

    void print_list()
    {
        if(root==null && last==null)
            System.out.println("Empty list");//does'nt exist
        else
        {
            Dnode t=root;
            do{
                System.out.println("<-"+t.data+"->");
                t=t.right;
            }while (t!=root);
        }

    }
    void print_reverse()
    {
        if(root==null && last==null)
            System.out.println("Empty list");//does'nt exist
        else
        {
            Dnode t=last;
            do{
                System.out.println("<-"+t.data+"->");
                t=t.left;
            }while (t!=last);
        }

    }

}
