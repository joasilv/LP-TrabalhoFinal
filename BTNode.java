public class BTNode<E> {
    private E data;
    private BTNode<E> left, right;
    /**
     * 
     */
    public BTNode(E initialData, BTNode<E> initialleft, BTNode<E> initialRight){
        data = initialData;
        left = initialleft;
        right = initialRight;

    }
    /**
     * Acessor para obter data do nó
     * @param return data deste nó
     */
    public E getData(){
        return data;
    }

    /**
     * Acessor para obter uma referência ao filho esquerdo deste nó.
     * @return uma referência ao filho esquerdo deste nó (ou a referência nula, se houver não é filho esquerdo)
     */
    public BTNode <E> getLeft(){
        return left;
    }

    /**
     * Acessor para obter os dados do nó mais à esquerda da árvore abaixo 
     * este nó.
     * @return os dados do nó mais profundo que podem ser alcançados a partir desse nó
   * seguindo os links à esquerda.
     */
    public E getLeftmostData(){
        if(left == null){
            return data;
        }
        else{
            return left.getLeftmostData();        }
    }

    /**
     * 
     * @return
     */
    public BTNode<E> getRight(){
        return right;
    }

    /**
     * 
     * @return
     */
    public E getRightmostData(){
        if(left==null){
            return data;
        }
        else{
            return left.getRightmostData();
        }
    }

    public void inorderPrint(){
        if(left !=null){
            left.inorderPrint();
        }
        System.out.println(data);
        if(right !=null){
            right.inorderPrint();
        }
    }
}