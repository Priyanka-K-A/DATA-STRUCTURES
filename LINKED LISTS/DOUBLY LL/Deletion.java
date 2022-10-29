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
    void insertion(int data)
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
    void deleteAtBeginning()
    {
        if(head!=null)
        {
            head = head.next;
            head.next.prev = null;
        }
    }
    void deleteAtEnd()
    {
        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.prev.next = null;
    }
    void deleteAtPosition(int loc)
    {
        Node temp = head;
        while(--loc>0)
        {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
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
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int data = sc.nextInt();
	        dll.insertion(data);
	    }
	    ll.display();
	    dll.display();
	    dll.deleteAtBeginning();
	    dll.display();
	    dll.deleteAtEnd();
	    dll.display();
	    dll.deleteAtPosition(3);
	    dll.display();
	}
}
