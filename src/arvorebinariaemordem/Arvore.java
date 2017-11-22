package arvorebinariaemordem;

/**
 *
 * @author Harrison
 */
public class Arvore {

    private No raiz;

    public Arvore(No raiz) {
        
        this.raiz = null;
    }

    public Arvore() {
    }
    
    

    void inserir(int chave) //metodo de inserção na arvore
    {
        if (raiz == null) {
            raiz = new No(chave);
        } else {
            inserirAux(raiz, chave);
        }

    }

    public void inserirAux(No no, int chave) {
        if (chave < no.getChave()) {
            if (no.getEsq() == null) {
                No novo_no = new No(chave);
                no.setEsq(novo_no);
            } else {
                inserirAux(no.getEsq(), chave);
            }
        } else if (chave > no.getChave()) {
            if (no.getDir() == null) {
                No novo_no = new No(chave);

                no.setDir(novo_no);

            } else {
                inserirAux(no.getDir(), chave);
            }
        }

    }

    //metodo get que retorna a raiz
    No getRaiz() {
        return this.raiz;
    }
    
        public void preordem(No node) {
        if (node != null) {
            System.out.print(node.getChave() + ", ");
            preordem(node.getEsq());
            preordem(node.getDir());

        }
    }

    void emOrdem(No no) {
        if (no != null) {
            emOrdem(no.getEsq());
            System.out.print(no.getChave() + " ");
            emOrdem(no.getDir());

        }

    }
    
    
    public  void posordem(No no) {
        if (no != null) {

            posordem(no.getEsq());
            posordem(no.getDir());
            System.out.print(no.getChave() + ", ");

        }

    }
    
    

}
