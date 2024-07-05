package Problems;

public class Max_Stack_Example {


    static  void global_pop(Stack s,Stack m)
    {
        if(s.peek()== m.peek()){
            s.pop();
            m.pop();


        }
        else {
            s.pop();
        }
    }

    static void global_push(Stack s, Stack ms, int e)
    {
        s.push(e);
        if(ms.is_empty()||e> ms.peek())
            ms.push(e);//push it on normal stack if(ms.is_empty()==true || e>ms.peek())//see peek of max_stack if empty or if e is greater , then push to Max_stack ms.push(e);

    }
    public static void main(String[] args) {
        Stack normal = new Stack();
        Stack Max_stack=new Stack();
        normal.create_stack(10);
        Max_stack.create_stack(10);
        global_push(normal,Max_stack,10);
        global_push(normal,Max_stack,4);
        global_push(normal,Max_stack,20);
        global_push(normal,Max_stack,8);
        global_push(normal,Max_stack,30);

        System.out.println("Normal stack");
        normal.print_stack();
        System.out.println("max Stack");
        global_pop(normal,Max_stack);
        global_pop(normal,Max_stack);
        normal.print_stack();
        Max_stack.print_stack();



    }
}
