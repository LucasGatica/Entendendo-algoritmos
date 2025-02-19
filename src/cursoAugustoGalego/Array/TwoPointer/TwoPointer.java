package cursoAugustoGalego.Array.TwoPointer;

public class TwoPointer {
    public static void main(String[] args) {
        char[] palavra = "lucas".toCharArray();

        int inicio = 0;
        int fim = palavra.length - 1;

        for (int i = 0; i < palavra.length / 2; i++) {
            char novoInicio = palavra[fim];
            char novoFim = palavra[inicio];

            palavra[inicio] = novoInicio;
            palavra[fim] = novoFim;

            inicio++;
            fim--;
        }
        System.out.println(palavra);
    }
}
