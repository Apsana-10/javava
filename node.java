class node{
    int data;
    node next;
    node(int n){
        this .data=n;
        this.next=null;
    }
}
public class Main
{
	public static void main(String[] args) {
	    node a=new node(1);
	    node b=new node(2);
	    node c=new node(3);
	    a.next=b;
	    b.next=c;
	    System.out.println(a.data);
	    System.out.println(a.next.data);
	    System.out.println(a.next.next.data);
	   	}
	}
 