public class Circular_LL {
    private Node head;
    private Node tail;
    public Circular_LL(){
        this.head=null;
        this.tail=null;

    }
private class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;
    }
}

// Insertion
public void insert(int val){
        Node node=new Node(val);
        if (head==null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next =head;
        tail=node;

}

// Deletion

    public void delete(int val){
        Node node=head;
        if (node.val==val){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node temp=node.next;
            if (temp.val==val){
                node.next=temp.next;
                break;
            }
            node=node.next;
        }while (node!=head);
    }



// Display

public void display(){

        Node node=head;
        if (head!=null){
            do {
                System.out.print(node.val+"->");
                node=node.next;
            }while (node!=head);
            System.out.println("null");
        }

}

    public static void main(String[] args) {
        Circular_LL cl=new Circular_LL();
        cl.insert(12);
        cl.insert(6);
        cl.insert(9);
        cl.insert(8);
        cl.insert(22);
        cl.display();
        cl.delete(9);
        cl.display();

    }

}
