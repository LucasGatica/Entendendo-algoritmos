import java.util.ArrayList;

public class SelectionSort {

    //usando arraylist(muito facil)
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

    //usando array

    public static int[] selectionSort(int[] array){
        int[] arrayBase = new int[1];

        int tamanho = array.length;

        for(int i =0;i<tamanho;i++){
            int indexMenorValor = MenorValor(array);

        }

        return arrayBase;
    }

    private static int MenorValor(int[] array) {
        int menorValor = array[0];
        int indexMenorValor = 0;

        for(int i =0;i<array.length;i++){
            if(array[i]<menorValor){
                menorValor=array[i];
                indexMenorValor=i;
            }
        }
        return indexMenorValor;
    }
}
