import java.util.Scanner;
public class TsiEMelhor {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String s;
        System.out.print("Entrada: ");
        s = ler.nextLine();
        System.out.println();
        System.out.printf("Entrada: %s\n",s); //ESARF ATERCES ODALERAHCAB ME AICNEIC AD OAÇATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OAÇATUPMOC OD ODATSE ED SAIOG
        System.out.printf("Saída..: %s\n", inverterCaracteres(s));
    }
    public static String inverterCaracteres(String s){
        int p, t;
        String a;
        a = "";
        t = s.length();
        for(p=(t-1);p>=0;p--){
            a = a + s.charAt(p);
        }return(a);
    }   
}