public class BuscaBinaria {

    public static Integer buscaBinaria(int[] lista, int item){
        int baixo = 0;
        int alto = lista.length-1;
        int meio;

        while( baixo<= alto){
            meio = (baixo+alto)/2;
            int chute = lista[meio];
            if(chute == item)
                return meio;
            if(chute > item)
                alto = meio-1;
            else
                baixo = meio+1;
        }
        return null;
    }
}
