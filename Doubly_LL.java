public class Doubly_LL {

    private Node tail;

    private class Node{
        int value;
        Node next;
        Node previous;

        public Node(int val){
            this.value=val;
        }
        public Node(int val,Node next,Node prev){
            this.value=val;
            this.next=next;
            this.previous=prev;
        }
    }

 private  Node  head;
    // Insert First
    public void insertFist(int val){
        Node node=new Node(val);
        node.next=head;
        node.previous=null;
        if (head!=null){
            head.previous=node;
        }
        head=node;
    }

    //Insert last

    public void insertLast(int val){
        Node node= new Node(val);
        Node last=head;
        node.next=null;
        if (head==null){
            head.previous=null;
            head=node;
            return;
        }
        while (last.next!=null){
           last=last.next;
        }
        last.next=node;
        node.previous=last;

    }

// Insert default

    public Node find(int after){
        Node node=head;
        while (node!=null){
            if (node.value==after){
                return node;
            }
            node=node.next;
        }
        return null;
    }
    public void insert(int after,int data){
        Node prev=find(after);
         if (prev==null){
             System.out.println("Does not exit!");
             return;
         }
         Node node =new Node(data);
         node.next=prev.next;
         prev.next=node;
         node.previous=prev;
         if (node.next!=null){
             node.next.previous=node;
         }

    }

    // Display Forward
  public void displayForward(){
        Node node=head;
        while (node!=null){
            System.out.print(node.value+"->");
            node=node.next;
        }
    System.out.println("null");

}

// Display backward
    public void displayBackward(){
        Node node=head;
        Node tail=null;
        while (node!=null){
            tail=node;
            node=node.next;
        }
        while (tail!=null){
            System.out.print(tail.value+"->");
            tail=tail.previous;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {

        Doubly_LL dd=new Doubly_LL();
        dd.insertFist(3);
        dd.insertFist(2);
        dd.insertFist(4);
        dd.insertFist(6);
        dd.insertFist(9);
        dd.displayForward();
        dd.displayBackward();
        dd.insertLast(11);
        dd.insert(6,23);
        dd.displayForward();



    }
}
