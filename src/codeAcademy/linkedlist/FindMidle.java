package codeAcademy.linkedlist;

import codeAcademy.node.Node;

public class FindMidle {

    public static void main(String []args) {
        // Use this to test your code:
        LinkedList ll = createList(8);
        ll.printList();
        Node n = findMiddle(ll);
        System.out.print(n.data);
    }

    public static Node findMiddle(LinkedList linkedList) {
        Node fastPointer= linkedList.head;
        Node slowPointer= linkedList.head;

        while(fastPointer!=null){
            fastPointer=fastPointer.getNextNode();
            if(fastPointer!=null){
                fastPointer=fastPointer.getNextNode();
                slowPointer=slowPointer.getNextNode();
            }
        }
        return slowPointer;
    }

    public static LinkedList createList(int length) {
        LinkedList list = new LinkedList();
        for (int i = 1; i <= length; i++) {
            list.addToTail(String.valueOf(i));
        }
        return list;
    }

}