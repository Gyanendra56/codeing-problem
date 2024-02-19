class myll { //linkedlist class
    Node head; // head node create krenge

    public class Node { // node class
        String data; // string type ka data lenge
        Node next; // next node add krenge

        public Node(String data) { // constructor bna lenge
            this.data = data; // jisme data assign kr denge
            this.next = null; // next node ke last ne null dal denge
        }
    }

    // add - first ya last opration ko perform krenge
    public void addFirst(String data) { // add first ka function bna lenge
        Node newNode = new Node(data); // new node create kr lete hai
        if (head == null) { // chek krenge ki head null to nhi hai
            head = newNode; // head me assign kr denge newnode ki value
            return;
        }
        newNode.next = head; // to new node ka next point krega hmare head ki trf
        head = newNode; // head ki value bn jayegi new node
    }

    // add last opration
    public void addLast(String data) { // addlast ka function create kr lete hai
        Node newNode = new Node(data); // new node create kr lete hai
        if (head == null) { // chek krenge ki head null to nhi hai
            head = newNode; // head me assign kr denge newnode ki value
            return;
        }

        Node currNode = head; // node ko treverse kre denge
        while (currNode.next != null) { // ek ek krke current node ko update krte rhnge jb tk curr node null na ho jaye
            currNode = currNode.next; // curr node ko bna denge currnode ka next
        }
        currNode.next = newNode; // phir currnode ko newnode bna dengek
    }

    // print linkedlist operation
    public void printList() { // linkedlist kp print krne ka function
        if (head == null) { // agr head null huya to
            System.out.println("list is empty"); // print kra denge list ois empty
            return;
        }
        Node currNode = head;
        while (currNode != null) { // ek ek krke current node ko update krte rhnge jb tk curr node null na ho jaye
            System.out.print(currNode.data + "  -> "); // ab print kr denge hr ek bar apne currnode ke data ko
            currNode = currNode.next; // curr node ko bna denge currnode ka next
        }
        System.out.println("null"); // last me print kra denge null ko
    }

    public static void main(String args[]) {
        myll list = new myll(); // apne add first function ko call krte hai
        list.addFirst("a"); // isme apna data pass krte hai
        list.addFirst("is"); // isme string pass krte hai
        list.printList();

    }
}





      