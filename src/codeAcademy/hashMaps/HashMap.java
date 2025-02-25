package codeAcademy.hashMaps;


import java.util.Arrays;

public class HashMap {

    public String[] hashmap;

    public HashMap(int size) {
        this.hashmap = new String[size];

    }

    public int hash(String key){
        int hashCode = 0;
        for (int i =0; i<key.length();i++){
            hashCode+= key.charAt(i);
        }
        return hashCode%hashmap.length;
    }

    public void assign(String key, String value){
        //    hashmap[]
        int arrayIndex = this.hash(key);

        hashmap[arrayIndex]= value;

    }
    public static void main(String[] args) {
        HashMap employees = new HashMap(3);
        employees.assign("34-567", "Mara");


        System.out.println(Arrays.toString(employees.hashmap));
    }
}