
class node{
    int data;
    node next;
    node(int n)
    {
        this .data=n;
        this.next=null;
    }
}
class linkedList
{
    node head=null;
    void add(int n);
    {
         node  newnode= new node(n);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            node curr = head;
            while(curr.next!=null)
            {
                curr=curr.next;
            }
            curr.next = newnode;
            Void display();
            {
                node curr=head;
                while(curr!=null)
                {
                 System.out.println(curr.data);
                curr = curr.next;
                }
            }
            
        }
        Void addf(int n);
        node newnode = new node(n);
        newnode.next=head;
        this.head = newnode;
    }
    Void display();
    {
        node curr = head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    linkedList1= new linkedList();
	    1 . add(1);
	    1 . add(2);
	    1 . add(3);
	    1 . addf(4);
	    1 . addf(5);
	    1 . display();
	   	}
    }
 