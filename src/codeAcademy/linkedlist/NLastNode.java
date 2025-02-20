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
        Node nthLastNode = null;
        Node currentNode = list.head;
        while(currentNode!=null){
            if(currentNode.getNextNode()==null){
                currentNode = currentNode.getNextNode();
                break;
            }
            if (currentNode.getNextNode().data.equals(String.valueOf(n))){
                nthLastNode = currentNode;
            }
            currentNode= currentNode.getNextNode();
        }
        return nthLastNode;
    }

    public static LinkedList createList() {
        LinkedList list = new LinkedList();
        for (int i = 50; i >= 1; i--) {
            list.addToTail(String.valueOf(i));
        }
        return list;
    }

}