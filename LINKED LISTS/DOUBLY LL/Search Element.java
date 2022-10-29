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
	    DoublyLinkedList dll = new DoublyLinkedList();
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int data = sc.nextInt();
	        dll.insertion(data);
	    }
	    dll.display();
	    int key = sc.nextInt();
	    dll.search(key);
	}
}
