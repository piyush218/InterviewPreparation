package stack;
/*Define a stack in which we can get its minimum number with a function min. The time
complexity of min, push, and pop on such stacks are all O(1).
It would have been enough if it was only push operations, but incase our minimum itself is popped,
we thus have to basically keep track af the minimums at all pushes using an auxiliary stack.*/
public class MinElementInStack {

    static int size = 5;
    static int[] myStack = new int[size];
    static int[] auxStack = new int[size];
    static int top = -1, topAux = -1;
    static int min = Integer.MAX_VALUE;
    
    public static void main(String[] args)
    {
        push(10);
        push(8);
        System.out.println("min is: " + min);
        pop();
        System.out.println("min is: " + min);
        
    }

    private static void push(int val) {
        if(top < size-1)
        {
            top++;
            myStack[top] = val;
            if(min >= val)//push in the min val in the auxiliary stack for the current element
            {
                min = val;
                pushAux(min);
            }
            
        }
        else
        {
            System.out.println("Stack Overflow");
        }
    }
    
    private static void pushAux(int val)
    {
        if(topAux < size)
        {
            topAux++;
            auxStack[topAux] = val;
        }
        else
        {
            System.out.println("Aux Stack Overflow- Can store any more minimum values");
        }
    }
    
    private static void pop()
    {
        if(top == -1)
        {
            System.out.println("Stack Underflow");
        }
        else
        {
            System.out.println("Popping " + myStack[top]);
            top--;
            popAux();//pop out the min val in the auxiliary stack for the current element
            
        }
    }
    private static void popAux()
    {
        if(topAux == -1)
        {
            System.out.println("Auxiliary Stack Underflow- No more mins left");
        }
        else
        {
            topAux--;
            min = auxStack[topAux];
        }
    }
}
