import java.util.*;
class Node 
{
    int data;
    Node next;
}
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
    void insertAtBeginning(int data)
    {
        Node nn = createNewNode(data);
        if(head==null)
            head = nn;
        else
        {
            nn.next = head;
            head = nn;
        }
    }
    void insertAtEnd(int data)
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
    void insertAtPosition(int data,int loc)
    {
        Node nn = createNewNode(data);
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
	    LinkedList ll = new LinkedList();
	    ll.insertAtBeginning(10);
	    ll.insertAtBeginning(20);
	    ll.insertAtBeginning(30);
	    ll.display();
	    ll.insertAtEnd(40);
	    ll.insertAtEnd(50);
	    ll.display();
	    ll.insertAtPosition(60,3);
	    ll.display();
	} 
}
