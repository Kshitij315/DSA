package Stack;

import java.util.Scanner;

public class Stack_Example_1 {
    public static void main(String[] args) {

      Stack stk=new Stack();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of stack");
        int option;
        int size=sc.nextInt();
        stk.create_stack(size); //intializing the stack

        do{
            //menu
            System.out.println("\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n");
             option=sc.nextInt();
            switch (option)
            {
                case 1:
                  if(stk.is_full()!=true)//not full
                  {
                      System.out.println("Enter a number");
                      int input=sc.nextInt();
                      stk.push(input);
                  }
                  else
                      System.out.println("Stack is full");
                  break;
                case 2:
                    if(stk.is_empty()!=true)
                    {
                        System.out.println("Element popped is "+stk.pop());
                    }
                    else
                        System.out.println("Stack is Empty");
                break;
                case 3:
                    if(stk.is_empty()!=true)
                    {
                        System.out.println("Element @peek is: "+stk.peek());
                    }
                    else
                        System.out.println("Stack is Empty");
                    break;
                case 4:
                    if(stk.is_empty()!=true)
                    {
                        System.out.println("Elements in stack are");
                        stk.print_stack();
                    }
                    else
                        System.out.println("Stack is Empty");
                    break;
                case 0:
                    System.out.println("exiting...");
                default:
                    System.out.println("invalid input exiting");
            }
        }while (option!=0);
    }
}
