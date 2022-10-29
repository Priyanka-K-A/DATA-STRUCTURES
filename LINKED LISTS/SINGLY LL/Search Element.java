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
    void search(int key)
    {
        Node temp = head;
        int flag=0;
        while(temp!=null)
        {
            if(temp.data == key)
            {
                flag=1;
                break;
            }
            temp = temp.next;
        }
        System.out.println((flag==1)?"Element Found!":"Element Not Found!");  
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
	    Scanner sc = new Scanner(System.in);
	    LinkedList ll = new LinkedList();
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int data = sc.nextInt();
	        ll.insertion(data);
	    }
	    ll.display();
	    int key = sc.nextInt();
	    ll.search(key);
	 }
}
