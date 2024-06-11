package LinkedListExample;

import Queue.CircularQueue;

import java.util.Scanner;

public class LinkedList_Main {

    public static void main(String args[])
    {
        int ch;
        Scanner in=new Scanner(System.in);

        Linked_List obj=new Linked_List();
        obj.create_list();
        do
        {
            System.out.println("1.Insert Left\n2.Delete Left\n3.Insert right\n4.Delete right\n5.Print list\n6.Search list\n0.Exit:");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Please enter element");
                    int elmnt=in.nextInt();
                    obj.insert_left(elmnt);

                    break;
                case 2:

                    obj.delete_left();
                    break;
                case 3:
                    System.out.println("Please enter element");
                    int input=in.nextInt();
                    obj.insert_right(input);
                    break;
                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                case 6:
                    System.out.println("enter an element to search");
                    int element=in.nextInt();
                    obj.search_list(element);
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);
    }

}
