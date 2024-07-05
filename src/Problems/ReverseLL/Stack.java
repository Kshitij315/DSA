package Problems.ReverseLL;

public class Stack {
    int s[],tos,maxsize;
    void create_stack(int size)
    {
        maxsize=size;
        tos=-1;
        s=new int[maxsize];
    }

    void push(int input)
    {
        tos++;
        s[tos]=input; //s[++tos]=input reduced method
    }

    boolean is_full()
    {
        if(tos==maxsize-1)
            return true;
        else
            return false;
    }
    int pop()
    {
        int temp=s[tos];
        tos--;
        return temp;
    }
    boolean is_empty()
    {
        if(tos==-1)
            return true;
        else
            return false;
    }
    int peek()
    {
        //returns topmost element from stack
        return s[tos];
    }

    void print_stack()
    {
        for (int i = tos; i >=0 ; i--) {
            System.out.println(s[i]);
        }
    }


}
