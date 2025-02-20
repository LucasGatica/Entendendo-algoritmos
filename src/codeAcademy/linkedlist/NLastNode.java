package codeAcademy.linkedlist;


import codeAcademy.node.Node;

public class NLastNode {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList();
        ll.printList();
        Node n = nthLastNode(ll, 9);
        System.out.print(n.data);
    }

    public static Node nthLastNode(LinkedList list, int n) {
        Node current = null;
        Node tailSeeker = list.head;
        int count = 0;
        while (tailSeeker != null) {
            tailSeeker = tailSeeker.getNextNode();
            if (count >= n) {
                if (current == null) {
                    current = list.head;
                }
                current = current.getNextNode();
            }
            count++;
        }
        return current;
    }

    public static LinkedList createList() {
        LinkedList list = new LinkedList();
        for (int i = 50; i >= 1; i--) {
            list.addToTail(String.valueOf(i));
        }
        return list;
    }

}