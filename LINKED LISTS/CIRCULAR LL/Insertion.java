class Node 
{
    int data;
    Node next;
}
class CircularLinkedList
{
    Node head = null;
    Node createNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        return nn;
    }
    void insertAtBeginning(int data)
    {
        Node nn = createNode(data);
        if(head==null)
        {
            nn.next = nn;
            head=nn;
        }
        else
        {
            Node temp = head;
            while(temp.next!=head)
            {
                temp = temp.next;
            }
            temp.next = nn;
            nn.next = head;
            head = nn;
        }
    }
    void insertAtEnd(int data)
    {
        Node nn = createNode(data);
        Node temp = head;
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        nn.next = head;
        temp.next = nn;
    }
    void insertAtPosition(int data,int loc)
    {
        Node nn = createNode(data);
        Node temp = head;
        while(--loc>0)
        {
            temp = temp.next;
        }
        nn.next = temp.next;
        temp.next = nn;
    }
    void display()
    {
        Node temp = head;
        while(temp.next!=head)
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.print(temp.data+" ");
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	    CircularLinkedList cll = new CircularLinkedList();
	    cll.insertAtBeginning(30);
	    cll.insertAtBeginning(10);
	    cll.display();
	    cll.insertAtEnd(40);
	    cll.insertAtEnd(50);
	    cll.display();
	    cll.insertAtPosition(20,1);
	    cll.display();
	}
	
}
