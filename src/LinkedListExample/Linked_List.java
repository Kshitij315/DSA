package LinkedListExample;

public class Linked_List {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    Node root;
    void create_list()
    {
        root=null;//root is not there
    }
    void insert_left(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            n.next = root;
            root = n;
        }
        System.out.println(data + " Inserted");
    }

    void delete_left() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node t = root;//1
            root = root.next;//2
            System.out.println(t.data + " deleted");
        }
    }

    void insert_right(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
        } else {
            Node t = root;//step 1
            while (t.next != null) {//step2
                t = t.next;
                t.next = n;//step 3
            }
        }
        System.out.println(n + " Inserted");
    }

    void delete_right() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node t = root;//1
            Node t2 = t;//1
            while (t.next != null)//2
            {
                t2 = t;
                t = t.next;
            }
            if (t == root)//one node only
                root = null;
            else
                t2.next = null;//3

            System.out.println(t.data + " deleted");
        }


    }

    void print_list()
        {
            if (root == null)
                System.out.println("Empty list");
            else {
                Node t = root;//1
                while (t != null) {
                    System.out.print("|" + t.data + "|->");
                    t = t.next;
                }
            }
        }
        void search_list ( int key)
        {
            if (root == null)
                System.out.println("Empty list");
            else {
                Node t = root;//1
                while (t != null) {
                    if (t.data == key)
                        break;
                    t = t.next;
                }
                if (t == null)
                    System.out.println(key + " Not Found");
                else
                    System.out.println(key + " Found");
            }
        }

}


