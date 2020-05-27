/**
 * 
Esta classe cria um Nó que contém uma String e os nós esquerdo e direito.
  */
  public class Node {

	/**
	 * Construtor padrão, define os nós esquerdo e direito como nulos
	 */
	Node(){
		left = null;
		right = null;
	}
	/**
	 * Construtor não padrão, define os nós esquerdo e direito como nulos e define os dados da String como informações
	 
	 */
	Node(String info){
		left = null;
		right = null;
		data = info;
		
		
	}
	
	public Node left;
	public Node right;
	public String data;
	
	
}
