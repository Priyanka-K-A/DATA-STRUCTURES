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
    void insertion(int data)
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
    void deleteAtBeginning()
    {
        Node temp = head;
        while(temp.next!=head)
        {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;
    }
    void deleteAtEnd()
    {
        Node temp = head;
        Node prev = null;
        while(temp.next!=head)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = head;
        
    }
    void deleteAtPosition(int loc)
    {
        Node temp = head;
        while(--loc>0)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int data = sc.nextInt();
	        cll.insertion(data);
	    }
	    ll.display;
	    cll.display();
	    cll.deleteAtBeginning();
	    cll.display();
	    cll.deleteAtEnd();
	    cll.display();
	    cll.deleteAtPosition(1);
	    cll.display();
	}
	
}
