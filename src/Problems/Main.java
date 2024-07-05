package Problems;

import java.util.Scanner;

class PolynomialAddition {

    static class Node {
        int coef;
        int power;
        Node next;

        public Node(int coef, int power) {
            this.coef = coef;
            this.power = power;
            this.next = null;
        }
    }

    Node root; // Head of the linked list

    public void create_list() {
        root = null; // Initialize as an empty list
    }

    public void read_polynomial(int max_power) {
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

    public void insert_node(int coef, int power) {
        Node new_node = new Node(coef, power);
        if (root == null) {
            root = new_node;
        } else {
            Node temp = root;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new_node;
        }
    }

    public void print_list() {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.coef + "x^" + temp.power + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        PolynomialAddition obj = new PolynomialAddition();
        PolynomialAddition obj2 = new PolynomialAddition();

        // Example: Creating and reading polynomials
        obj.create_list();
        obj.read_polynomial(3); // Example: read 3 terms for obj
        obj.print_list();

        obj2.create_list();
        obj2.read_polynomial(3); // Example: read 3 terms for obj2
        obj2.print_list();

        // Example: Adding two polynomials obj and obj2 into obj3
        PolynomialAddition obj3 = addPolynomials(obj, obj2);
        obj3.print_list();
    }

    public static PolynomialAddition addPolynomials(PolynomialAddition obj1, PolynomialAddition obj2) {
        PolynomialAddition obj3 = new PolynomialAddition();
        PolynomialAddition.Node temp_r1 = obj1.root;
        PolynomialAddition.Node temp_r2 = obj2.root;

        while (temp_r1 != null && temp_r2 != null) {
            if (temp_r1.power > temp_r2.power) {
                obj3.insert_node(temp_r1.coef, temp_r1.power);
                temp_r1 = temp_r1.next;
            } else if (temp_r1.power < temp_r2.power) {
                obj3.insert_node(temp_r2.coef, temp_r2.power);
                temp_r2 = temp_r2.next;
            } else {
                obj3.insert_node(temp_r1.coef + temp_r2.coef, temp_r1.power); // Combine coefficients for same powers
                temp_r1 = temp_r1.next;
                temp_r2 = temp_r2.next;
            }
        }

        // Add remaining terms from obj1 and obj2
        while (temp_r1 != null) {
            obj3.insert_node(temp_r1.coef, temp_r1.power);
            temp_r1 = temp_r1.next;
        }

        while (temp_r2 != null) {
            obj3.insert_node(temp_r2.coef, temp_r2.power);
            temp_r2 = temp_r2.next;
        }

        return obj3;
    }
}
