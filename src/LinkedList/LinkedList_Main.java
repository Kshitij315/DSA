package LinkedList;

//import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_Main {
    public static void main(String[] args)
    {
        int ch,e;
        Scanner in = new Scanner(System.in);
        Linked_List obj = new Linked_List();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.delete\n8.insert\n0.Exit\n:");
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
                case 6:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.search_list(e);
                    break;
                case 7:
                    System.out.println("enter element");
                    e=in.nextInt();
                    obj.delete(e);
                    break;
                case 8:
                    System.out.println("enter index" );
                    int index=in.nextInt();
                    System.out.println("Enter element to be inserted: ");
                    e=in.nextInt();
                    obj.insert_at(index,e);
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
