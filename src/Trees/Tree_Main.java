package Trees;

import java.util.Scanner;
public class Tree_Main {
    public static void main(String args[]) {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Tree obj = new Tree();
        obj.create_tree();
        do {
            System.out.println("\n1.Insert\n2.Inorder\n3.Search\n4.Count\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    Node n=new Node(e);
                    obj.insert_node(obj.root,n);
                    System.out.println("Data to inserted");
                    break;
                case 2:
                    System.out.println("Data in inorder:");

                    obj.inorder(obj.root);
                    break;
                case 3:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    System.out.println(e+" found in tree:"+obj.search(obj.root,e));
                    break;
                case 4:
                    System.out.println("Total nodes in tree:"+obj.count_node(obj.root));
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

