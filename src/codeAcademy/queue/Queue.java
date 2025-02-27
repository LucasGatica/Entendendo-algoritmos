package codeAcademy.queue;

import codeAcademy.linkedlist.LinkedList;

public class Queue {

    public LinkedList queue;
    public int size;
    static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public int maxSize;

    public Queue() {
        this(DEFAULT_MAX_SIZE);
    }

    public Queue(int maxSize){
        this.queue = new LinkedList();
        this.size = 0;
        this.maxSize = maxSize;
    }
    public boolean hasSpace(){
        return this.size<this.maxSize;
    }

    public boolean isEmpty(){
        return this.size==0;
    }

    public void enqueue(String data){
        if(hasSpace()){
            this.queue.addToTail(data);
            this.size++;
            System.out.println("Added "+data+"! Queue size is now "+ this.size);
        }else{
            throw new Error("Queue is full!");
        }
    }
    public String dequeue() {
        if(!isEmpty()){
            String data = this.queue.removeHead();
            this.size--;
            System.out.println("Removed "+data+"! Queue size is now "+this.size);
            return data;
        }
        throw new Error("Queue is empty!");
    }

    public String peek(){
        if(!isEmpty()){
            return this.queue.head.data;
        }
        return null;
    }

}
