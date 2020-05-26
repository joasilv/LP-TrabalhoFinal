/**
 Esta classe cria um nó que contém uma String e os nós esquerdo e direito
 */

public class no {
    /**Construtor padrão
     * Define os nós esquerdo e direito como nulos
     */
    No(){
        esquerdo=null;
        direito=null;

    }
    no(String info){
        esquerdo= null;
        direito= null;
        data = info;

    }

    public no esquerdo;
    public no direito;
    public String data;

}