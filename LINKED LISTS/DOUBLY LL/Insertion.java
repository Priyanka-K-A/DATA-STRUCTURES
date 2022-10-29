class Node 
{
    int data;
    Node next,prev;
}
class DoublyLinkedList
{
    Node head = null;
    Node createNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.prev = null;
        nn.next = null;
        return nn;
    }
    void insertAtBeginning(int data)
    {
        Node nn = createNode(data);
        if(head==null)
            head = nn;
        else
        {
            nn.next = head;
            head.prev = nn;
            head = nn;
        }
    }
    void insertAtEnd(int data)
    {
        Node nn = createNode(data);
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = nn;
        nn.prev = temp;
    }
    void insertAtPosition(int data,int loc)
    {
        Node nn = createNode(data);
        Node temp = head;
        //After specified Position
        while(--loc>0)
        {
            temp = temp.next;
        }
        nn.next = temp.next;
        nn.prev = temp;
        temp.next = nn;
        nn.next.prev = nn;
        //At Specific Position
        // Node prev = null;
        // while(--loc>0)
        // {
        //     prev = temp;
        //     temp = temp.next;
        // }
        // nn.prev = prev;
        // nn.next = temp;
        // prev.next = nn;
        // temp.prev = nn;
        
    }
    void display()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data);
            if(temp.next!=null)
            {
                System.out.print("->");
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	    DoublyLinkedList dll = new DoublyLinkedList();
	    dll.insertAtBeginning(30);
	    dll.insertAtBeginning(20);
	    dll.insertAtBeginning(10);
	    dll.display();
	    dll.insertAtEnd(40);
	    dll.insertAtEnd(50);
	    dll.display();
	    dll.insertAtPosition(70,3);
	    dll.display();
	}
}
