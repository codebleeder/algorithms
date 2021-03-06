package algo.ctci.ch2;

/**
 * Created by Sharad on 10/23/2016.
 */
public class LinkedList {
    public Node head;

    public LinkedList(){};
    public LinkedList(Node oNode){
        this.head = oNode;
    }


    public void insertNode(int i){
        Node n = new Node(i);
        if (this.head == null) this.head = n;
        else {
            Node x = head;
            Node y = new Node();
            while (x != null){
                y = x;
                x = x.next;
            }
            //x.next = n;
            y.next = n;
        }
    }

    public Node deleteNode(int i){
        Node n = this.head;
        Node prev = null;

        if (n.data == i) {
            this.head = n.next;
            return this.head;
        }
        else {
            while (n != null){
                if (n.data == i) {
                    prev.next = n.next;
                    return this.head;
                }
                prev = n;
                n = n.next;
            }
        }
        return this.head;
    }

    public void insert(int i){
        Node n = new Node(i);
        Node x = this.head;
        Node prev = null;
        if (this.head == null) this.head = n;
        else {
            while (x != null){
                prev = x;
                x = x.next;
            }
            prev.next = n;
            n.next = null;
        }
    }

    public LinkedList cloneL() {
        LinkedList oList = new LinkedList();
        try {
            Node x = this.head;
            Node y = new Node();
            while (x != null){
                y = x;
                x = x.next;
                oList.insert(y.data);
            }
            return oList;
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return oList;
    }

    public Node getNode(int n){
        Node x = new Node();
        x = this.head;
        int i=0;
        while (x != null){
            if (n == i) return x;
            x = x.next;
            i++;
        }
        return null;
    }

    public int getLength(){
        int length=0;
        Node x = this.head;
        while(x != null){
            x = x.next;
            length++;
        }
        return length++;
    }
}
