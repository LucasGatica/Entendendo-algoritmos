package codeAcademy.linkedlist;

import codeAcademy.node.Node;

public class LinkedList {

public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead!= null){
          this.head.setNextNode(currentHead);
      }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToHead("primeiro");
        linkedList.addToHead("segundo");
        linkedList.addToHead("terceiro");
        linkedList.addToHead("quarto");


        Node currentNode = linkedList.head;
        while (true){
            System.out.println(currentNode.data);
            currentNode = currentNode.getNextNode();
        }

    }
}
