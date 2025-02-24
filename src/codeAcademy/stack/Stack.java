package codeAcademy.stack;

import codeAcademy.linkedlist.LinkedList;

public class Stack {

    public LinkedList stack;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Stack() {
        this(DEFAULT_MAX_SIZE);
    }

    public Stack(int maxSize) {
        this.stack = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }

    // Define push() below
    public void push(String data){
        if(hasSpace()){
            this.stack.addToHead(data);
            this.size++;
            System.out.println("Added "+data+"! Stack size is now "+this.size);

        }else{
            throw new Error("Stack is full!");
        }

    }

    public String pop(){
        if(!isEmpty()){
            String data =this.stack.removeHead();
            this.size--;
            System.out.println("Removed "+ data+"! Stack size is now " +this.size);
            return data;
        }else{
            throw new Error("Stack is empty!");
        }

    }

    public boolean hasSpace(){
        return this.size<this.maxSize;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public String peek(){
        if(!isEmpty()){
            String data = stack.head.data;
            return data;
        }
        return null;
    }

    public static void main(String[]args) {

        Stack bracelets = new Stack();
        bracelets.push("silver");
        bracelets.push("gold");
        bracelets.push("bronze");
        System.out.println("I decided I only want to wear the silver bracelet!");
        bracelets.pop();
        bracelets.pop();

    }
}