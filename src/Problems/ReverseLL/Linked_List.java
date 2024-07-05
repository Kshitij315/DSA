package Problems.ReverseLL;

public class
Linked_List {


    Node2 root;

    void create_list() {
        root = null;//root is not there
    }

    void insert_left(int e) {
        Node2 n = new Node2(e);
        if (root == null)//not there then n is root
            root = n;
        else {
            n.next = root;//1
            root = n;//2
        }
        System.out.println(e + " inserted");

    }


    void insert_right(int e) {
        Node2 n = new Node2(e);//created
        if (root == null)//not there then n is root
            root = n;
        else {
            Node2 t = root;//1
            while (t.next != null)//2
                t = t.next;
            t.next = n;//3
        }
        System.out.println(e + " inserted");
    }

    void delete_left() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node2 t = root;//1
            root = root.next;//2
            System.out.println(t.data + " deleted");
        }
    }

    void delete_right() {
        if (root == null)//not there then n is root
            System.out.println("Empty list");
        else {
            Node2 t = root;//1
            Node2 t2 = t;//1
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

    void print_list() {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node2 t = root;//1
            while (t != null) {
                System.out.print("|" + t.data + "|->");
                t = t.next;
            }
        }
    }

    void search_list(int key) {
        if (root == null)
            System.out.println("Empty list");
        else {
            Node2 t = root;//1
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

    void delete(int key)
    {
        if(root==null)
        System.out.println("Empty list");
    else//list exists
    {
        Node2 t=root;//1
        Node2 t2=t;//1
        while(t!=null)
        {
            if(t.data==key)
                break;
            t2=t;
            t=t.next;
        }
        if(t==null)
            System.out.println(key+" Not Found");
        else//if found which case
        {
            System.out.println(key + " Found");
            if (t == root)//case 1
                root = root.next;
            else if (t.next == null)//case 2
                t2.next = null;
            else
                t2.next = t.next;
            System.out.println(t.data + " deleted");
        }
    }
    }

    void insert_at(int index,int e) {
        Node2 n = new Node2(e);//created
        if (index == 0)//start
        {
            if (root == null)//not there then n is root
                root = n;
            else //root already exists
            {
                n.next = root;
                root = n;
            }
        } else//see if index exists
        {
            Node2 t = root;
            Node2 t2 = t;
            while (index > 0 && t != null) {
                t2 = t;
                t = t.next;
                index--;
            }
            if (t == null)//if index out of bound
            {
                System.out.println("Index Out Of Bound");
            } else//found and to insert
            {
                t2.next = n;
                n.next = t;
                System.out.println(e + " inserted");
            }
        }
    }
}

