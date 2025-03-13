public class Stack {
    int maxSize=5;
    int top=-1;
    int a;
    int[] arr = new int[5];
    public void push (int number)
    {
        if (isfull()== true)
        {
            System.out.println("Stack overflow");
        }
    else {
        top++;
        arr[top] = number;
    }
}
public void show()
{
    int i;
    if (top ==-1)
    {
        System.out.println("Stack empty");
    }
    else 
    System.out.println("Elements in stack");
    for (i=0; i<=top; i++)
    {
        System.out.println(arr[i] + "");
    }
    System.out.println("");
}

public boolean isEmpty()
{
    if (top==-1)
    {
        return true;
    }
    else 
    return false;
}

public void peak()
{
    if (top>=0)
    {
        System.out.println(arr[top]);
    }
    else 
    {
        System.out.println("No elements is array");
    }
}
public boolean isfull()
{
    if (top== maxSize-1)
    return true;
    else 
    return false;
}
public void pop()
{
    if (top != -1)
    {
        int temp = arr[top];
        top --;
        System.out.println(temp+"");
    }
    else {
        System.out.println("Stack underflow");
    }
}



    public static void main(String[] args)
    {
        Stack myStack= new Stack();
        myStack.push(15);
        myStack.pop();
        myStack.push(1);
        myStack.push(25);
        myStack.show();
    }
}

