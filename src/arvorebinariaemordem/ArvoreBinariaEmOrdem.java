
package arvorebinariaemordem;

/**
 *
 * @author Harrison
 */
public class ArvoreBinariaEmOrdem {

    public static void main(String[] args) {

        Arvore arvore = new Arvore();

        arvore.inserir(10); //valores das raizes
        arvore.inserir(5);
        arvore.inserir(1);
        arvore.inserir(7);
        arvore.inserir(2);
        arvore.inserir(20);
        arvore.inserir(33);
        arvore.inserir(30);
        
        
        System.out.println("\nPercorrendo em Pré ordem...");
        arvore. preordem(arvore.getRaiz());
        System.out.println();

        System.out.println("\nPercorrendo em ordem...");
        arvore.emOrdem(arvore.getRaiz());
        System.out.println();
        
        System.out.println("\nPercorrendo em Pos ordem...");
        arvore.posordem(arvore.getRaiz());
        System.out.println();

    }

}
