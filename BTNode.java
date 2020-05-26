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
     * 
     * @return
     */
    public BTNode <E> getLeft(){
        return left;
    }
}