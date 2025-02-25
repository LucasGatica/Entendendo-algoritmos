package codeAcademy.hashMaps;

public class HashMap {

    public LinkedList[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedList[size];
       // this.hashmap = new String[size];
        for(int i =0; i<size; i++){
            this.hashmap[i] = new LinkedList();
        }

    }

    public int hash(String key){
        int hashCode = 0;
        for (int i =0; i<key.length();i++){
            hashCode+= key.charAt(i);
        }
        return hashCode%hashmap.length;
    }

    public void assign(String key, String value){
        int arrayIndex = this.hash(key);
        LinkedList list = this.hashmap[arrayIndex];

        if(list.head==null){
            list.addToHead(key,value);
            return;
        }

    }
/*
    public String retrieve(String key){
        int arrayIndex = this.hash(key);
        return hashmap[arrayIndex];
    }

 */

    public static void main(String[] args) {

    }
}