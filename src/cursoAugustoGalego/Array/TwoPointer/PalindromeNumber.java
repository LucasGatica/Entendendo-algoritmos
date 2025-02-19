package cursoAugustoGalego.Array.TwoPointer;

import java.util.Arrays;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));

    }
    public static boolean isPalindrome(Integer x){

        char[] palavra = x.toString().toCharArray();
        char[] palavraNaoAlterada = palavra.clone();

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
        return Arrays.equals(palavra, palavraNaoAlterada);
    }
}
