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

    /**
     * 
     */
    public void inorderPrint(){
        if(left !=null){
            left.inorderPrint();
        }
        System.out.println(data);
        if(right !=null){
            right.inorderPrint();
        }
    }
/**
 * 
 */

    public boolean isLeaf(){
        return (left == null ) && (right == null);
    }

/**
 * 
 */
    public void preorderPrint(){
        System.out.println(data);
        if(left != null){
            left.preorderPrint();
        }
        if(right != null){
            right.preorderPrint();
        }
    }


    /**
     * 
     */
    public void postorderPrint(){
        if(left!=null){
            left.postorderPrint();
        }
        if(right!=null){
            right.postorderPrint();
        }
    }

    /**
     * 
     * 
     */

     public void print(int depth){
         int i;
         //
         for(i = 1; i <= depth; i++){
             System.out.println("    ");
         }
         System.out.println(data);

         //Imprime a subtree esquerda
         if(left !=null){
             left.print(depth+1);
         }
         else if(right != null){
             for(i=1; i<= depth+1;i++){
                 System.out.println("   ");
             }
             System.out.println("--");
         }
     }

     /**
      * 
      */

      public BTNode<E> removeLeftmost(){
          if(left ==null){
              return right;
          }
          else{
              left= left.removeLeftmost();
              return this;
          }
      }


      /**
       * 
       */

       public BTNode<E> removeRightmost(){
           if(right== null){
               return left;
           }
           else{
               right=right.removeRightmost();
               return this;
           }
       }

       /**
        * 

        */

        public void setData(E newData){
            data=newData;
        }

        /**
         * 
         * 
         */

         public setLeft(BTNode<E> newLeft){
             left = newLeft;
         }
         public setRight(BTNode<E> newRight){
             right= newRight;
         }
}