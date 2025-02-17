package codeAcademy.node;

public class Node1 {

    public String data;
    private Node1 next;

    public Node1(String data){
        this.data = data;
        this.next = null;
    }

    public void setNextNode(Node1 node){
        this.next = node;
    }

    public Node1 getNextNode(){
        return this.next;
    }
// PRIMEIRO EXEMPLO
    public static void main(String[] args) {
        Node1 firstNode = new Node1("I am a Node!");
        System.out.println(firstNode.data);

        Node1 secondNode = new Node1("I am the second Node!");

        firstNode.setNextNode(secondNode);

        System.out.println(firstNode.getNextNode().data);
    }

}