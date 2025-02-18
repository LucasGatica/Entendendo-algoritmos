package codeAcademy.linkedlist;

import codeAcademy.node.Node;

public class LinkedList {

public Node head;

    public LinkedList() {
        this.head = null;
    }

    public String printList(){
        String output = "<head>";
        Node currentNode = this.head;
        while(currentNode!=null){
            output = output +" "+currentNode.data;
            currentNode =currentNode.getNextNode();
        }
        output= output+" <tail>";
        System.out.println(output);
        return output;

    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = this.head;
        this.head = newHead;
        if(currentHead!= null){
          this.head.setNextNode(currentHead);
      }
    }
    public String removeHead(){
        Node removedHead = this.head;
        if(removedHead==null){
            return null;
        }
        this.head = removedHead.getNextNode();
        return removedHead.data;
    }

    public void addToTail(String data) {
        Node tail = this.head;
        Node newNode = new Node(data);
        if(tail==null){
            this.head = newNode;
        }else{
            while (tail.getNextNode()!=null){
                tail = tail.getNextNode();
            }
            tail.setNextNode(newNode);
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addToHead("primeiro");
        linkedList.addToHead("segundo");
        linkedList.addToHead("terceiro");
        linkedList.addToHead("quarto");

     //   linkedList.addToTail("quinto");
       // linkedList.addToTail("sexto");


        Node currentNode = linkedList.head;
        System.out.println(linkedList.printList());

    }
}
