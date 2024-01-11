public class d1_practice2 {
    static class Node {
        int data;
        Node next;
        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }
    static class LinkedList {
        Node head;
        Node tail;

        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void traverse() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
//        Node n1 = new Node(14);
//        Node n2 =new Node(15);
//        n1.next=n2;
        LinkedList ll=new LinkedList();
        ll.insert(24);
        ll.insert(35);
        ll.insert(26);
        ll.traverse();



//        System.out.println(n1.data);
//        System.out.println(n2.data);


    }
}
