package livroEntendendoAlgoritmos;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] minhaLista = {1, 3, 5, 7, 9};
        ArrayList<Integer> minhaLista2 = new ArrayList<>(Arrays.asList(1,5,3,2,1, 9,-10));

        System.out.println(BuscaBinaria.buscaBinaria(minhaLista,9));
        System.out.println(BuscaBinaria.buscaBinaria(minhaLista,-1));

        System.out.println(SelectionSort.selectionSortComArrayList(minhaLista2));

    }

}