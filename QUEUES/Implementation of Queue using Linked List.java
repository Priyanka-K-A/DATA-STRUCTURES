class Node 
{
    int data;
    Node next;
}
class QueueUsingLL
{
    Node front = null,rear=null;
    Node createNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        return nn;
    }
    void enqueue(int data)
    {
        Node nn = createNode(data);
        if(front==null)
        {
            rear = nn;
            front = nn;
        }
        else
        {
            Node temp = front;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = nn;
            rear = nn;
        }
    }
    void deque()
    {
        if(front!=null)
        {
            front = front.next;
        }
    }
    void display()
    {
        Node temp = front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void peek()
    {
        System.out.println(front.data);
    }
}
public class Main 
{
    public static void main (String[] args) 
    {
        QueueUsingLL qll = new QueueUsingLL();
        qll.enqueue(10);
        qll.enqueue(20);
        qll.enqueue(30);
        qll.enqueue(40);
        qll.display();
        qll.deque();
        qll.display();
        qll.peek();
        
    }
}
