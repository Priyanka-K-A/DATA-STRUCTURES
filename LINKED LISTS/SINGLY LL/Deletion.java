import java.util.*;
class Node 
{
    int data;
    Node next;
};
class LinkedList
{
    Node head = null;
    Node createNewNode(int data)
    {
        Node nn = new Node();
        nn.data = data;
        nn.next = null;
        return nn;
    }
    void insertion(int data)
    {
        Node nn = createNewNode(data);
        if(head==null)
            head = nn;
        else
        {
            Node temp = head;
            while(temp.next!=null)
                temp = temp.next;
            temp.next = nn;    
        }
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
    void deleteAtBeginning()
    {
        if(head!=null)
            head = head.next;
    }
    void deleteAtEnd()
    {
        Node temp = head;
        Node prev = null;
        while(temp.next!=null)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next=null;
    }
    void deleteAtPosition(int loc)
    {
        Node temp = head;
        Node prev = null;
        while(--loc>0)
        {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
    }
}
public class Main
{
	public static void main(String[] args) {
	    LinkedList ll = new LinkedList();
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int data =  sc.nextInt();
	        ll.insertion(data);
	    }
	    ll.display();
	    ll.deleteAtBeginning();
	    ll.display();
	    ll.deleteAtEnd();
	    ll.display();
	    ll.deleteAtPosition(3);
	    ll.display();
	}
}
