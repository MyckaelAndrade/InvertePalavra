import java.util.Stack;
public class InverterPalavra {
    public static void main(String[] args) throws Exception {
        Stack<Character> pilha = new Stack<>();
        Stack<Character> a = new Stack<>();
        //UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE
        String frase = "UM CIENTISTA DA COMPUTAÇAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        for(int i=0; i<frase.length(); i++){ //add length() para calcular o tamanho da String automaticamente
            if(frase.charAt(i) != ' '){
                pilha.push(frase.charAt(i));
            }else{
                while(!pilha.empty()){
                    a.push(pilha.pop());
                }a.push(' ');
            }
        }
        while(!a.empty()){
            pilha.push(a.pop());
        }
        while(!pilha.empty()){
            System.out.print(pilha.pop());
        } //Enquanto pilha não for vazia, imprima pilha.
    }
}