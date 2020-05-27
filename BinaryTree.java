/**
Esta classe cria uma Árvore Binária que mantém os Nós preenchidos com uma String.

 */
public class BinaryTree {
	/**
     *Construtor padrão, define raiz e corrente como nulo.

	 */
	BinaryTree(){
		root = null;
		current = null;
		
	}
	
	
/**
* Insere informações de String na Árvore Binária com base no String Move usando uma função recursiva.
* @param info Valor a ser inserido na Árvore Binária
* @param move Valor que é considerado para colocar corretamente as informações
*/
	void Insert(String info, String move){
		root = InsertItem(root, info, move);
	}

	/**
* Imprime a Árvore Binária usando a função recursiva privada
*/
	void Print(){
		PrintTree(root);
	}
	
	
/**
* Avalia se a Árvore Binária está vazia ou não
* @return trueOrfalse True se raiz for nula
*/
	boolean isEmpty(){
		if (root == null){
			return true;
		}
		else{
		return false;
		}
		
	}
	
	
/**
* Avalia se a corrente está ou não localizada em um nó folha / filho final
* @return trueOrfalse True se a corrente precisar de nós para viajar para
*/
	boolean isAtEnd(){
		if ((current!= null) && (current.getLeft() == null && current.getRight() == null)){
			return true;
		}
		else{
			return false;
		}
	}
	/**
* Retorna o valor do nó atual
* @return current.data A cadeia localizada no nó atual.
*/
	String getCurrentData(){
		return current.getData();
		
	}
	
	
/**
* Move o ponteiro atual para o seguinte nó direito, sinalizando um SIM
*/
	void moveCurrentSim(){
		current = current.getRight();
	}
	
	
/**
* Move o ponteiro atual para o seguinte nó esquerdo, sinalizando um NÃO
*/
	void moveCurrentNao(){
		current = current.getLeft();
	}
	/**
* Move a corrente para a raiz, o ponto de partida.
*/
	void setCurrentToStart(){
		current = root;
		
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
	private Node InsertItem(Node newRoot, String value, String move){
		if (newRoot == null)
        {
        			newRoot = new Node(value);
        //			System.out.println("ROOT INSERIDO");
        			return newRoot;                  
		}
        else if (move == "S"){
       // 	System.out.println("SIM INSERIDO");
			newRoot.setRight(InsertItem(newRoot.getRight(), value, move));
		}
		else{ 
		//	System.out.println("NÃO INSERIDO");
			newRoot.setLeft(InsertItem(newRoot.getLeft(), value, move));
		}
		return newRoot;
	}
	 
	
/**
* Imprime os valores de Árvores binárias em um percurso de pré-encomenda
* @param root Nó inicial da árvore
*/
	private void PrintTree(Node root){
		if (root != null){
			System.out.println(root.getData());
			PrintTree(root.getLeft());
			PrintTree(root.getRight());
		}
	}
	
	//Data Members
	private Node root; // Ponto de partida da árvore binária
    private Node current; //Posição atual
	public Object getCurrent;

    public BinaryTree(Node root, Node current) {
        this.root = root;
        this.current = current;
    }

    //getters

    public Node getCurrent(){
        return current;
    }

    public Node getRoot(){
        return root;
    }

    //setters
    public void setRoot(Node newRoot){
        this.root=newRoot;
    }
    public void setCurrent( Node newCurrent){
        this.current=newCurrent;
    }
    
    

}
