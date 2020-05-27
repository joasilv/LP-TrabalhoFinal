import java.util.*;
/**
 * Esta é a classe principal que instancia a classe Bot e inicia o jogo de adivinhação.
 * Esta classe perguntará ao utilizador se já pensou num animal.
 * Além disso solicitará que o utilizador jogue novamente depois de terminar um jogo.
 *
 */


public class Main {
    /**
     * Main que começa o jogo
     * @param args
     */
    public static void main(String[] args) {
        bot GuessBot= new bot();
        char charChoice;//S ou N para começar o jogo
        char charEnd;//S ou N para jogar novamente

        Scanner ler = new Scanner(System.in);

        System.out.println("BEM-VINDO AO JOGO DA ADIVINHA!! HOJE VOU TENTAR ADIVINHAR O TEU ANIMAL!!");

        do{
            System.out.println("PENSE NUM ANIMAL. PRONTO?(s para começar) ");
            charChoice= ler.nextLine().toUpperCase().charAt(0);
            if(charChoice=='S'){
                do{
                    //FAZ PERGUNTAS
                    GuessBot.fazPergunta();

                    do{
                        // DoWhile loop para verificar o caracter digitado e permitir que o usuário digite novamente argumentos válidos
                        System.out.println("Jogar Novamente? (s/n)");
                        charEnd=ler.nextLine().toUpperCase().charAt(0);
                        if(charEnd != 'S' && charEnd != 'N'){
                            System.out.println("CARACTER INVALIDO");
                        }
                    }while(charEnd !='S' && charEnd !='N');
                }while(charEnd !='N');
            }
            else if(charChoice=='N'){
                System.out.println("EU ESPERO");
            }
            else{
                System.out.println("CARACTER INVALIDO. TENTE NOVAMENTE");
            }
        }while(charChoice != 'Y');

        ler.close();
    }
}