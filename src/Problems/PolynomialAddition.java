package Problems;

import java.util.Scanner;

public class PolynomialAddition {


    class Node {

        float coef;
        int power;
        Node next;

        Node(int coef, int power) {
            this.coef = coef;
            this.power = power;

            Node next = null;
        }
    }

    Node root;
    void create_list()
    {
        root=null;
    }
    void read_polynomial(int max_power) {
        for (int local_power = max_power; local_power >= 0; local_power--) {
            Scanner in = new Scanner(System.in);
//read coefficients System.out.println("For power " + local_power + " give coefficeint:");
            int co = in.nextInt();
            Node n = new Node(co, local_power);
            if (root == null)
                root = n;
            else {
                Node t = root;
                while (t.next != null)
                    t = t.next;
                t.next = n;
            }
        }
    }
    void print_list()
    {
        if(root==null)
            System.out.println("Empty list");
        else
        {
            Node t=root;//1 while(t!=null)
            {
                System.out.print(t.co+"X^"+t.power+" + ");
                t=t.next;
            }
        }
    }
    void insert_node(int co,int power)
    {
        Node n = new Node(co, power);
        if (root == null)
            root = n;
        else {
            Node t = root;
            while (t.next != null)
                t = t.next;
            t.next = n;
        }
    }


}
