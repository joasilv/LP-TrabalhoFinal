import java.util.*;

/**
 * Esta é a classe principal que instancia a classe Bot e inicia o jogo de adivinhação.
 * Ele perguntará ao usuário se ele ou ela pensou em um animal.
 * Além disso, ele solicitará que o usuário jogue novamente depois que ele terminar um jogo.
 */

public class Game {
    
    /**
     * Main que começa o jogo
     * @param args
     */

    public static void main(String[] args) {
        //Bot GuessBot= new Bot();
        char charChoice; //S OU N para começar o jogo
        char charEnd; //S OU N para jogar novamente

        Scanner ler = new Scanner(System.in);
        System.out.println("OLÁ!! VAMOS COMEÇAR!!");
        do{//Loop DoWhile para verificar o caractere digitado e permitir que o usuário digite novamente argumentos válidos
            System.out.println("OK. Pense em um animal. Pronto? ('s' para continuar)");
            charChoice=ler.next().toUpperCase().charAt(0);
            if(charChoice =='S'){
                do{// Faz Perguntas
                    //GuessBot.askQuestion;
                    do{
                        System.out.println("Jogar Novamente?");
                        charEnd= ler.next().toUpperCase().charAt(0);
                    }
                    
                }
            }
        }
    }
}