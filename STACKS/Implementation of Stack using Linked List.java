class Node 
{
    int data;
    Node next;
}
class StackUsingLL
{
    Node top=null;
    Node createNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        return nn;
    }
    void push(int data)
    {
        Node nn = createNode(data);
        if(top==null)
        {
            top = nn;
        }
        else
        {
            nn.next = top;
            top = nn;
        }
    }
    void pop()
    {
        if(top!=null)
        {
            top = top.next;
        }
    }
    void display()
    {
        Node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void peek()
    {
        System.out.println("Peek : "+top.data);
    }
}
public class Main 
{
    public static void main (String[] args) 
    {
        StackUsingLL sll = new StackUsingLL();
        sll.push(40);
        sll.push(30);
        sll.push(20);
        sll.push(10);
        sll.display();
        sll.peek();
        sll.pop();
        sll.display();
        sll.peek();
        
    }
}
