/**
 * Esta classe cria uma arvore binaria que contem os nos preenchidos com a String
 */

public class BinaryTree{

    /**
     * Construtor padrão
     * Define root e current para null
     */

     BinaryTree(){
         root=null;
         current= null;

     }

     /**
      * Insere informações de String na Árvore Binária com base no String Move usando uma função recursiva privada.
      @param info valor inserido na arvore binária
      @param move Valor que é considerado para colocar corretamente as informações

      */
      void Insert(String info, String move){
          root= InsertItem(root, info, move);
      }

      /**
       * Imprime a arvore binaria utilizando uma função recurisva privada
       */
      void Print(){
          PrintTree(root);
      }

      /**
       * Avalia se a arvore binaria esta vazia ou nao
       * @return trueOrfalse, true se root == null
       */
      boolean isEmpty(){
          if(root== null){
              return true;
          }
          else{
              return false;
          }

      }

      /**
       * Avalia se o current está ou não localizada  num nó folha / filho final
       * @return trueOrfalse, true se current tiver um nó para viajar
       */
      boolean isAtEnd(){
          if((current!= null)&&(current.esquerdo == null && current.direito == null)){
              return true;
          }
          else{
              return false;
          }
      }

      /**
       * Devolve o valor do nó current
       * @return current.data a String localizada no nó current
       */
      String getCurrentData(){
          return current.data;
      }

      /**
       * Move o ponteiro atual para o seguinte nó direito, sinalizando um SIM
       */
      void moveCurrentSim(){
          current=cuurrent.direito;
      }

      /**
       * Move o ponteiro atual para o seguinte nó esquerdo, sinalizando um NÃO
       */

       void moveCurrentNao(){
           current=current.esquerdo;
       }
       /**
        * Move current para root, o ponto de partida
        */
        void setCurrentToStart(){
            current=root;
        }
      
// Funções recursivas
/**
* Insere o valor da string no nó apropriado.
* Se newRoot não estiver preenchido, esse método o preencherá recursivamente
* Nó @param newRoot considerado para inserção
* valor @param String a ser inserida no novo Nó
* @param move String que determina onde colocar outros valores de String
* @return newRoot O nó que foi inserido na Árvore Binária
*/
private No InsertItem(no newRoot, String value, String move){
    if(newRoot==null){
        newRoot = new Node(value);
        //System.out.println("ROOT inserido")
        return newRoot;
    }
    else if(move =="S"){
        //System.out.println("SIM inserido")
        newRoot.direito= InsertItem(newRoot.direito, value, move);

    }
    else{
        //System.out.println("NO inserido")
        newRoot.esquerdo= InsertItem(newRoot.esquerdo, value,move);
    }
    return newRoot;
}


/**
* Imprime os valores de Árvores binárias num percurso de preorder
* @param root Nó inicial da árvore
*/
private void PrintTree(Node root){
    if(root != null){
        System.out.println(root.data);
        PrintTree(root.esquerdo);
        PrintTree(root.direito);
    }
}

//Membros data
private No root; //ponto de partida da arvore binaria
private No current; //posição atual

}