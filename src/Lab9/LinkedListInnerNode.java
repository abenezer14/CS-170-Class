
public class LinkedListInnerNode {
    //private Node head;
    private class Node {
        private double data = 0;
        private Node next = null;

        public Node() { }

        public Node(double data) {
            this.data = data;
        }
    }

    private Node head = null;

    public LinkedListInnerNode() { }

    public boolean insert(double item) {
        Node newNode = new Node(item);

        Node ptr = head;
        Node prev = null;

        while (ptr != null && ptr.data < item) {
            prev = ptr;
            ptr = ptr.next;
        }

        if (ptr == null || ptr.data != item) {
            newNode.next = ptr;
            if (prev != null) {
                prev.next = newNode;
            } else {
                head = newNode;
            }
            return true;
        }
        return false;
    }

    public boolean delete(int item) {
        boolean deleted;
        Node ptr = head, prev = null;
        deleted = false;

        // If head node itself holds the key to be deleted 
        if (ptr != null && ptr.data == item) {
            deleted = true;
            head = ptr.next; // Changed head   

        }
        // Search for the key to be deleted, keep track of the 
        // previous node as we need to change temp.next 
        while (ptr != null && ptr.data == item) {
            prev = ptr;
            ptr = ptr.next;
        }

        // If key was not present in linked list 
        if (ptr == null)
            return false;
        else
            prev.next = ptr.next;
        return deleted;
    }

    public void makeCopy(LinkedListInnerNode original) {
        Node ptr= original.head;
        while(ptr!= null){
            this.insert(ptr.data);
            ptr=ptr.next;
        }
    }

//    public static LinkedListInnerNode makeCopy(LinkedListInnerNode original) {
//        LinkedListInnerNode newList =  new LinkedListInnerNode();
//
//        Node ptr= original.head;
//        while(ptr!= null){
//            newList.insert(ptr.data);
//            ptr=ptr.next;
//        }
//
//        return newList;
//    }

    public void calcArea(LinkedListInnerNode otherlist) {
        Node ptr = otherlist.head;
        while (ptr != null) {
            insert(ptr.data * ptr.data * 3.14);
            ptr = ptr.next;


        }


    }

    public void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }


}
