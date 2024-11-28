import java.util.ArrayList;

public class SelectionSort {

    public static  ArrayList<Integer>  selectionSortComArrayList( ArrayList<Integer>  array){
        ArrayList<Integer> arrayOrdenado = new ArrayList<>();
        int size = array.size();

        for (int i=0;i<size;i++){
            int menorValor = array.remove(MenorValoComArrayList(array));
            arrayOrdenado.add(menorValor);
        }
        return arrayOrdenado;
    }

    private static int MenorValoComArrayList(ArrayList<Integer>  array) {
        int menorValor = array.get(0);
        int menorIndex = 0;

        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) <menorValor){
                menorValor= array.get(i);
                menorIndex = i;
            }
        }
        return menorIndex;
    }
}
