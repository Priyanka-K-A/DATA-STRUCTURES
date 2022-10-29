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
	    cll.display();
	    int key = sc.nextInt();
	    cll.search(key);
	}
	
}
