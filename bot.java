import java.util.*;


/**
 * Esta classe cria um "Bot" que opera como a voz e o programa dojogo.
 * Esta classe cria uma nova Árvore Binária e manipula-a usando métodos pertencentes à classe BinaryTree.
 * Este "Bot" fará as perguntas e inserirá as respostas numa Árvore Binária.
 * Ele continuará tentando adivinhar até que desista ou alcance uma resposta correta.
 *
 */

public class bot {
    BinaryTree GuessTree; //árvore binária para armazenar perguntas
    Scanner ler = new Scanner(System.in);
    /**
     * Construtor default, cria uma nova árvore binária
     */
    bot(){
         GuessTree = new BinaryTree();
    }

    void fazPergunta(){
        String animal;
        String pergunta;
        char SouN;
        if(GuessTree.isEmpty()){
            /*Arvore vazia*/
            giveup();
            //System.out.println(root.data);
        }
        else if(GuessTree.isAtEnd()){
            /*está no nó final*/
            //System.out.println("FIM");
            animal= GuessTree.current.data;
            pergunta= "É " + UmouUma (animal)+ " "+ animal+"?";
            // DoWhile loop para verificar o caractere digitado e permitir que o usuário digite novamente argumentos válidos
            do{
                System.out.println(pergunta);
                SouN=ler.nextLine().toUpperCase().charAt(0);
                if(SouN=='S'){
                    System.out.println("GANHEI!!!!");
                    GuessTree.setCurrentToStart();

                }
                else if(SouN=='N'){
                    giveup();
                }
                else{
                    System.out.println("TECLA INVALIDA. TENTE NOVAMENTE.");
                }
            }while(SouN != 'S' && SouN !='N');
        }
        else{
            /*FAZ PERGUNTA*/
            //System.out.println("PERGUNTANDO");
            pergunta = GuessTree.current.data;// nó pergunta
            // DoWhile loop para verificar o caractere digitado e permitir que o usuário digite novamente argumentos válidos
            do{
                System.out.println(pergunta);
                SouN=ler.nextLine().toUpperCase().charAt(0);
                if(SouN=='S'){
                    GuessTree.moveCurrentSim();
                    fazPergunta();

                }
                else if(SouN=='N'){
                    if(GuessTree.current.left==null){
                        giveup();
                    }
                    else{
                        GuessTree.moveCurrentNao();
                        fazPergunta();
                    }
                }
                else{
                    System.out.println("TECLA INVALIDA. TENTE NOVAMENTE.");
                }

            }while(SouN !='S' && SouN !='N');
        }
    }
    
    
    /**
    * Se o Bot não conseguir adivinhar o animal correto, ele desistirá e solicitará que o usuário insira o animal e uma pergunta que o descreva.
    */
    void giveup(){
        String oldAnimal; //Animal adivinhado
        String animal; //novo animal
        String pergunta; //String concatenada
        String novaPergunta; //nova pergunta
        System.out.println("Desisto. Qual é?");
        animal= ler.nextLine();
        pergunta= "Qual a pergunta que me diz que animal é " + UmouUma(animal)+ " " + animal + "?";
        System.out.println(pergunta);
        novaPergunta = ler.nextLine();
        /*Se a árvore binária está vazia*/
        if(GuessTree.isEmpty()){
            //move nova pergunta para a direita
            GuessTree.Insert(novaPergunta, "S");
            //move novo animal para a direita
            GuessTree.Insert(animal, "S");
            GuessTree.setCurrentToStart();
        }
        /*SE O PONTEIRO ATUAL ESTIVER NO INÍCIO E O UTILIZADOR INSERIR NÃO NA PRIMEIRA PERGUNTA */
        else if(GuessTree.current.data==GuessTree.root.data){
            //move nova pergunta para a esquerda
            GuessTree.Insert(novaPergunta, "N");
            GuessTree.moveCurrentNao();
            // define o ponteiro atual para o novo nó da pergunta
            GuessTree.current.right=new Node(animal);
            GuessTree.setCurrentToStart();

        }
        else{
            /* SE O NÓS É UMA PERGUNTA */
            if(GuessTree.current.data.contains("?")){
                //CRIA NOVO NÓ ESQUERDO
                GuessTree.current.left=new Node(novaPergunta);
                //CRIA NOVO NÓ left.right
                GuessTree.current.left.right= new Node(animal);
                GuessTree.setCurrentToStart();
            }
            /*SE O ANIMAL ESTIVER ERRRADO*/
            else{
                //oldAnimal é o animal escolhido pelo bot
                oldAnimal=GuessTree.current.data;
                //nova pergunta substitui o nó de oldAnimal
                GuessTree.current.data=novaPergunta;
                //oldAnimal é empurrado para a esquerda
                GuessTree.current.left= new Node(oldAnimal);
                //o novo animal correto é colocado à direita
                GuessTree.current.right=new Node(animal);
                GuessTree.setCurrentToStart();
            }
        }
    }

    
/**
* Este método coloca a estrutura gramatical correta à frente de uma sequência de animais.
* @param animal O animal que precisa ser analisado
* @return aOran an se a primeira letra do animal começar com uma vogal, a para qualquer outra coisa
*/
String UmouUma(String animal){
    
}
}