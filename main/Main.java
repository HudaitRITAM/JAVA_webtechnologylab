class Main {
    public static void main(String args[])
    {
        Stack s = new Stack();
        System.out.println("Stack is Empty:"+s.Empty()+"\n");
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(100);
        s.push(110);
        System.out.println("Stack elements :");
        s.display();
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Final Stack elements :");
        s.display();
    }
}
class Stack {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX];
 
    boolean Empty()
    {
        return (top < 0);
    }
    Stack()
    {
        top = -1;
    }
 
    boolean push(int x)
    {
        if (top >= (MAX - 1)) {
            System.out.println("hello java");
            return false;
        }
        else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
 
    int pop()
    {
        if (top < 0) {
            System.out.println("hi world");
            return 0;
        }
        else {
            int x = a[top--];
            return x;
        }
    }
 
    int top()
    {
        if (top < 0) {
            System.out.println("hi world");
            return -99;
        }
        else {
            int x = a[top];
            return x;
        }
    }

    void display()
    {
        if (top < 0) {
            System.out.println("hi world");
        }
        else {
            for(int i=0;i<=top;i++)
            {
                System.out.println(a[i]+" ");
            }
        }
        System.out.println();
    }
}
