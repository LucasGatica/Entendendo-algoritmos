package cursoAugustoGalego.leetCode;

public class LC557 {
    public static void main(String[] args) {

        String s = "banana teste aro";
        int p1 = 0;
        int p2 = 0;

        char[] chars = s.toCharArray();
        char[] charsFinal = new char[s.length()];

        while (p2 < s.length()) {
            if(chars[p2]== ' '){
                int p3 = p2;
                int p4 = p1;
                while(p4<p3){

                    charsFinal[p3-1] = chars[p1];
                    p1++;
                    p3--;
                }
            }
            p2++;
            if(chars[p1]==' '){
                charsFinal[p1]=' ';
                p1++;
                System.out.println("aaaaa");
            }
        }

int p5=p2;
int p6=p1;

        while (p6<p5){
            charsFinal[p5-1]= chars[p1];
            p1++;
            p5--;
        }
        System.out.println(new String(charsFinal));
    }
}
