public class d2_prctice1 {
    static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        node head;
        node tail;

        public void insert(int data) {
            node newNode = new node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        public void traverse() {
            node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
        public void delete(int data){
            node currunt = head;
            node previous = null;
            while(currunt != null) {
                if (currunt.data == data) {
                    if (currunt.next==null) {
                        previous.next=null;
                    } else {
                        System.out.println(data+" "+"not the last element");
                    }

                    break;
                }
                previous = currunt;
                currunt = currunt.next;
            }
        }
    }
    public static void main(String[] args) {
        stack s1=new stack();
        s1.insert(1);
        s1.insert(2);
        s1.insert(3);
        s1.insert(4);
        s1.traverse();
        s1.delete(3);
        s1.traverse();
        s1.delete(1);
        s1.traverse();


    }
}
