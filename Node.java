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
	
	private Node left;
	private Node right;
	private String data;
	
	public String getData(){
        return data;
    }

    public Node getLeft(){
        return left;
    }

    public Node getRight(){
        return right;
    }

    public void setData( String newData){
        this.data= newData;
    }

    public void setLeft( Node newLeft){
        this.left=newLeft;
    }
    public void setRight( Node newRight){
        this.right = newRight;
    }
}
