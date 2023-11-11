import java.util.*;
class Node{
    Node next;
    int el;
    Node(int el)
    {
        this.el=el;
        this.next=null;
    }
}
class LinkedListExample{
    Node head=null;
	Node current = null;
	int el;
    void create(int el)
    {
		Node NewNode = new Node(el);
		NewNode.el = el;
        NewNode.next = null;
        if(head == null)
        {
           head=NewNode;
           current=NewNode;
        }
        else
        {
            current.next=NewNode;
            current=NewNode;
        }
    }
    void display()
    {
        if(head==null)
        System.out.println("list is empty");
        else{
            Node temp=head;
            while(temp!=null)
            {
                System.out.println(temp.el);
                temp=temp.next;
            }
        }
    }
}
class Lab11
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedListExample l=new LinkedListExample();
        System.out.println("1.create 2.display");

while (true) {
    System.out.println("enter choice");
    int ch = sc.nextInt();
    switch (ch) {
        case 1:
            System.out.println("enter element to be inserted");
            int el = sc.nextInt();
            l.create(el);
            break;
        case 2:
            l.display();
            break;
        case 3:
            System.exit(0); // Exiting the program when the user enters 3
            break; // This break is important to exit the switch statement
        default:
            System.out.println("Invalid choice");
    }
}

    }
}
